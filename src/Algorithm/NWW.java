package Algorithm;


public class NWW extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "NWW";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        NWW w = new NWW();
        w.nww(a, b);

    }
    private void nww(int a, int b){
        int result = (a * b) / najwiekszyWspolnyDzielnik(a, b);
        System.out.println(result);
    }

    private int najwiekszyWspolnyDzielnik(int k, int n) {
        if (k==0) {return n;}

        return najwiekszyWspolnyDzielnik(n%k, k);
    }
}
