package Algorithm;

public class Lider extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Lider";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] tab = new int[input.length-1];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i+1]);
            if (tab[i] > max){
                max = tab[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < tab.length; i++) {
           int liczba = tab[i];
            count[liczba]++;
        }
        int maxWystapien = 0;
        for (int index = 0; index < count.length; index++) {
            if (count[index] > maxWystapien){
                maxWystapien = count[index];
            }
        }
        if (maxWystapien > tab.length/2){
            System.out.println(count[tab[maxWystapien]]);
        } else {
            System.out.println(-1);
        }

    }
}
