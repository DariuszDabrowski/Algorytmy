package Algorithm;

public class Dominanta extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Dominanta";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] T = new int[input.length-1];
        int max = 0;
        for (int i = 0; i < T.length; i++) {
            T[i]=Integer.parseInt(input[i+1]);
            if (T[i] > max){
                max = T[i];
            }
        }
        int[] L = new int[max+1];
        int[] W = new int[L.length];

        for (int i = 0; i < T.length; i++) {
            int liczba = T[i];
            W[liczba]++;
        }
        int dominanta = 0;
        int ileRazy = 0;
        for (int i = 0; i < W.length; i++) {
            if(W[i] > dominanta){
                dominanta=i;
                ileRazy = W[i];
            }
        }
        System.out.println(dominanta + " wystapila " + ileRazy);
    }
}
