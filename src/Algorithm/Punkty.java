package Algorithm;

public class Punkty extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Punkty";
    }

    @Override
    public void runAlgoritm(String[] input) {

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

    }
}
