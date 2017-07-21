package Algorithm;


public class Test extends AbstractAlgorithm {
    public Test(){
        System.out.println("Konstruktor test");
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        System.out.println("To jest algorytm testowy");
    }
}
