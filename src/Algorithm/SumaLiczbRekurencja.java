package Algorithm;


public class SumaLiczbRekurencja extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Suma Liczb Rekurencja";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(sumaRek(n));

    }

    private int sumaRek(int n) {
        if(n == 1){
            return 1;
        }
        return n + sumaRek(n-1);
    }
}
