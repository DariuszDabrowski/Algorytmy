package Algorithm;


public class Punkty extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Punkty";
    }

    @Override
    public void runAlgoritm(String[] input) {
        String odpKuby = input[1].toUpperCase();
        String odpZenka = input[2].toUpperCase();
        String odpBogdana = input[3].toUpperCase();
        int kubaPkt = 0;
        int zenekPkt = 0;
        int bogdanPkt = 0;
        int maxPkt = 0;

        char[] kuba = odpKuby.toCharArray();
        char[] zenek = odpZenka.toCharArray();
        char[] bogdan = odpBogdana.toCharArray();

        for (int i = 0; i < kuba.length; i++) {
            if(zenek[i] != kuba[i]){
                zenekPkt++;
            }
            if(bogdan[i] != kuba[i]) {
                bogdanPkt++;
            }
        }
        maxPkt = zenekPkt + bogdanPkt;
        System.out.println("Max punktow: " + maxPkt);
    }
}
