package Algorithm;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class Tablice extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "Tablice";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Random mRand = new Random();
        //System.out.printf("%d", mRand.nextInt());
        int[] rand = new int[10];
        int[] parzyste = new int[10];
        int[] nieparzyste = new int[10];
//        for (int i = 0; i < rand.length; i++) {
//            rand[i] = mRand.nextInt();
//        }
//        for (int i: rand){
//            System.out.println(i);
//        }
        for (int i = 0, j = 0; i < parzyste.length; i++, j+=2) {
            parzyste[i] = j;
            System.out.println(j);

        }

        for (int i = 0, j = 1 ; i < nieparzyste.length; i++, j+=2) {
                nieparzyste[i] = j;
            System.out.println(j);

        }


    }
}
