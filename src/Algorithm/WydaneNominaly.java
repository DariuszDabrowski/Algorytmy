package Algorithm;


public class WydaneNominaly extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Wydane Nominaly";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int kwotaZl = Integer.parseInt(input[1]);
        int kwotaGr = Integer.parseInt(input[2]);
        int[] tabZl = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] tabGr = {50, 20, 10, 5, 2, 1};
        int[] wydaneZl = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] wydaneGr = {0, 0, 0, 0, 0, 0};


        while(kwotaZl > 0) {
            for (int i = 0; i < tabZl.length ; i++) {
                if (kwotaZl >= tabZl[i]){
                    kwotaZl -= tabZl[i];
                    wydaneZl[i]++;
                    break;
                }
            }
        }
        for (int i = 0; i < wydaneZl.length; i++) {
            if (wydaneZl[i]>0){
            System.out.println(wydaneZl[i]  + " x  " + tabZl[i] + " zl");}
        }
        while(kwotaGr > 0) {
            for (int i = 0; i < tabGr.length ; i++) {
                if (kwotaGr >= tabGr[i]){
                    kwotaGr -= tabGr[i];
                    wydaneGr[i]++;
                    break;
                }
            }
        }
        for (int i = 0; i < wydaneGr.length; i++) {
            if (wydaneGr[i]>0){
            System.out.println(wydaneGr[i]  + " x  " + tabGr[i] + " gr");}
        }

    }
}
