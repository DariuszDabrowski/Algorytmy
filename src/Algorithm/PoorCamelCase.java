package Algorithm;


public class PoorCamelCase extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgoritm(String[] input) {
      int letter = 0;
        String word;

        for (int i = 1; i < input.length; i++) {
            word = input[i];
            char[] tab = word.toCharArray();
            for (int j = 0; j<tab.length; j++) {
                Character c = tab[j];
                if (letter %2 == 0) {
                    System.out.print(c.toString().toUpperCase());
                } else {
                    System.out.print(c.toString().toLowerCase());
                }
                letter++;

            }
            System.out.print(" ");
        }
    }
}
