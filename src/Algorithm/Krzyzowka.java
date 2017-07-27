package Algorithm;


public class Krzyzowka extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "Krzyzowka";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int size = Integer.parseInt(input[1]);
            if (Math.sqrt(size) % 1 == 0) {
                int sqrtSize = (int) Math.sqrt(size);
                String[][] tablica = new String[size][size];
                String[] literki = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"
                        , "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

                for (int i = 0; i < sqrtSize; i++) {
                    for (int j = 0; j < sqrtSize; j++) {
                        tablica[i][j] = literki[i] + (j+1);
                    }
                }
                for (int i = 0; i < sqrtSize; i++) {

                    for (int j = 0; j < sqrtSize; j++) {
                        System.out.print(tablica[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("liczba nie ma pierwiastka bez reszty");
            }
    }
}
