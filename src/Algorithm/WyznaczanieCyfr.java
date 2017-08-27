package Algorithm;

/**
 * Created by RENT on 2017-07-25.
 */
public class WyznaczanieCyfr extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyznaczanie Cyfr";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        wyznacz(n);



    }
    private void wyznacz(int n) {
        switch(n) {
            case 1:
                System.out.println("0 1");
                break;
            case 2:
                System.out.println("0 2");
                break;
            case 3:
                System.out.println("0 6");
                break;
            case 4:
                System.out.println("2 4");
                break;
            case 5:
                System.out.println("2 0");
                break;
            case 6:
                System.out.println("2 0");
                break;
            case 7:
                System.out.println("4 0");
                break;
            case 8:
                System.out.println("2 0");
                break;
            case 9:
                System.out.println("8 0");
                break;
            default:
                System.out.println("0 0");
        }
    }

}
