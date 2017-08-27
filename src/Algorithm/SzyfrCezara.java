package Algorithm;


public class SzyfrCezara extends AbstractAlgorithm{
//    char[] literki = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
//            ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//    int pozycja;
    @Override
    public String getName() {
        return "Szyfr Cezara";
    }
    private String _literki[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M"
            ,"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    @Override
    public void runAlgoritm(String[] input) {
        for (int words = 1; words<input.length; words++) {
            String word = input[words].toUpperCase();
            char lettersInWord[] = word.toCharArray();
            for (int letter = 0; letter < lettersInWord.length; letter++) {
                int position = getPosition(Character.toString(lettersInWord[letter]));
                int move = (position + 3) % _literki.length;
                System.out.printf("%s", _literki[move]);
            }
            System.out.print(" ");
        }
//        String word = input[1];
//        char[] tab = word.toUpperCase().toCharArray();
//
//
//        for (int i = 1; i < input.length; i++) {
//            for (int j = 0; j < tab.length; j++) {
//                pozycja = getPosition(tab[j]);
//
//            }
//
//        }

    }
    private int getPosition(String letter) {
        for (int i = 0; i < _literki.length; i++) {
            if(letter.equals( _literki[i]))
                return i;
        }
        return -1;
    }

}
