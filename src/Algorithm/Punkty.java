package Algorithm;

<<<<<<< HEAD
public class Punkty extends AbstractAlgorithm {
=======

public class Punkty extends AbstractAlgorithm{
>>>>>>> 5d94e5015a6eb8e53b82fd2a7f28150ef055ec6b
    @Override
    public String getName() {
        return "Punkty";
    }

    @Override
    public void runAlgoritm(String[] input) {
<<<<<<< HEAD

        String odpKuby = input[1].toUpperCase();
        String odpBogdana = input[2].toUpperCase();
        String odpZenka = input[3].toUpperCase();

        char[] tabKuba = odpKuby.toCharArray();
        char[] tabBogdan = odpBogdana.toCharArray();
        char[] tabZenek = odpZenka.toCharArray();

        int pktKuba = 0;
        int pktBogdan = 0;
        int pktZenek = 0;
        int maxPkt = 0;

        for (int i = 0; i < tabKuba.length; i++) {
            if (tabBogdan[i] != tabKuba[i])
                pktBogdan++;
            if(tabZenek[i] != tabKuba[i])
                pktZenek++;
        }
        maxPkt = pktBogdan + pktZenek;
        System.out.println(maxPkt);

=======
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
>>>>>>> 5d94e5015a6eb8e53b82fd2a7f28150ef055ec6b
    }
}
