package Algorithm;


public class SumaLiczb extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Suma liczb";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int suma = 0;

        for (int i = 1; i < input.length; i++) {
            suma += Integer.parseInt(input[i]);
        }
        System.out.println(suma);
    }
}
