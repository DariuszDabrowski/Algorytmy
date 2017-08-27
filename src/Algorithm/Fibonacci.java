package Algorithm;


public class Fibonacci extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "Fibonacci";

    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        System.out.println(wyznaczFib(n));
    }
    private int wyznaczFib(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return wyznaczFib(n-1) + wyznaczFib(n-2);
    }
}
