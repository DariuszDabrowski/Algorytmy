package Algorithm;


public class BiednyCamelCase extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgoritm(String[] input) {
      int literki = 0;
        String wyraz;

        for (int i = 1; i < input.length; i++) {
            wyraz = input[i];
            char[] tab = wyraz.toCharArray();
            for (int j = 0; j<tab.length; j++) {
                Character c = tab[j];
                if (literki %2 == 0) {
                    System.out.print(c.toString().toUpperCase());
                } else {
                    System.out.print(c.toString().toLowerCase());
                }
                literki++;

            }
            System.out.print(" ");
        }
    }
}
