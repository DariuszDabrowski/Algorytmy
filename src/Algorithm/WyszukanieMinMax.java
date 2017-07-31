package Algorithm;


public class WyszukanieMinMax extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Wyszukanie Min Max";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] tab = new int[input.length-1];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i+1]);
        }
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < tab[indexMin]){
                indexMin = i;
            }
            if(tab[i]>tab[indexMax]){
                indexMax = i;
            }
        }
        System.out.printf("MIN -> na indeksie -> %d\n MAX -> na indeksie -> %d",indexMin, indexMax);

    }
}
