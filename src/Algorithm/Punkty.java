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

        char[] kuba = odpKuby.toCharArray();
        char[] zenek = odpZenka.toCharArray();
        char[] bogdan = odpBogdana.toCharArray();

        for (int i = 0; i < kuba.length; i++) {
            for (int j = 0; j < zenek.length; j++) {
                if(zenek[j] != kuba[j]){
                    zenekPkt++;
                }
            }
        }

        for (int i = 0; i < kuba.length; i++) {
            for (int j = 0; j < bogdan.length; j++) {
                if(bogdan[j] != kuba[j]){
                    bogdanPkt++;
                }
            }
        }
        int maxPkt = zenekPkt + bogdanPkt;
        System.out.println("Max punktow: " + maxPkt);

    }
}
