package Algorithm;

public class NajwiekszyWspolnyDzielnik extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Najwiekszy Wspolny Dzielnik";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        System.out.println(najwiekszyWspolnyDzielnik(k, n));

    }
    private int najwiekszyWspolnyDzielnik(int k, int n) {
        if (k==0) {return n;}

        return najwiekszyWspolnyDzielnik(n%k, k);
    }
}
