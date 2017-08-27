package Algorithm;

/**
 * Created by RENT on 2017-08-04.
 */
public class Duplikat extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Duplikat";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int[] tab = new int[input.length - 1];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i+1]);
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]){
                    System.out.printf("Duplikat %d na pozycjach %d i %d", tab[j], j, i);
                    return;
                }
            }
        }
        System.out.println("Tablica nie ma duplikatow.");
    }
}
