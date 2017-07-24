package Algorithm;


public class SumaLiczbNaturalnych extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Sumowanie liczb naturalnych";
    }

    @Override
    public void runAlgoritm(String[] input) {


        int n = Integer.parseInt(input[1]);
        int suma = 0;

        for (int i = 1; i <= n ; i++) {
            suma += i;
        }
        System.out.println(suma);

    }
}
