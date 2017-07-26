package Algorithm;


public class SortowanieBabelkowe extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Sortowanie Babelkowe";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int tab[] = new int[input.length-1];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i+1]);
        }
        for (int i = 0; i < tab.length; i++) {
            for(int j =0;j<tab.length-1;j++){
                if (tab[j]>=tab[j+1]) {
                    int temp;
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }


    }
}
