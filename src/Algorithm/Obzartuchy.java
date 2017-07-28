package Algorithm;

/**
 * Created by RENT on 2017-07-27.
 */
public class Obzartuchy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Obzartuchy";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int liczbaObzartuchow = Integer.parseInt(input[1]);
        int liczbaCiastekWPudelku = Integer.parseInt(input[2]);
        int[] czasyJedzenia = new int[liczbaObzartuchow];
        int iterator = 3;
        for (int i = 0; i < liczbaObzartuchow; i++) {
            czasyJedzenia[i] = Integer.parseInt(input[iterator]);
            iterator++;
        }


    }
}
