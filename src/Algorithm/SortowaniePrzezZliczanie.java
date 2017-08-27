package Algorithm;


public class SortowaniePrzezZliczanie extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Sortowanie Przez Zliczanie";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int max = Integer.parseInt(input[1])+1;
        int n = input.length - 2;
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = Integer.parseInt(input[i+2]);
        }
        int[] zliczanie = new int[max];
        for (int i = 0; i < tab.length; i++) {
            int liczba = tab[i];
            zliczanie[liczba]++;
        }
        for (int indeksTablicy = 0; indeksTablicy < zliczanie.length; indeksTablicy++) {
           if (zliczanie[indeksTablicy]>0) {
               for (int ileLiczb = zliczanie[indeksTablicy]; ileLiczb > 0; ileLiczb--) {
                   System.out.printf("%d ", indeksTablicy);
               }
           }
        }



    }
}
