package Algorithm;


public class SpacjeCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Spacje Camel Case";
    }

    @Override
    public void runAlgoritm(String[] input) {
        String word;
        char letters[];
        for (int words = 1; words < input.length; words++) {
            word = input[words];
            letters = word.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                if (i==0){
                    System.out.print(Character.toString(letters[i]).toUpperCase());
                } else {
                    System.out.print(Character.toString(letters[i]));
                }
            }
            System.out.println(isUpperCase(letters[0]));

        }

    }

    public static boolean isUpperCase(char ch) {
        char[] upperCase = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
                            ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < upperCase.length; i++) {
            if (ch == upperCase[i]){
                return true;
            }
        }
        return false;
    }
}
