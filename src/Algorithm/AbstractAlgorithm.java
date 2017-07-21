package Algorithm;

public abstract class AbstractAlgorithm {
    public AbstractAlgorithm() {
        System.out.println("Konstruktor AbstractAlgorithm");
    }
    public abstract String getName();
    public abstract void runAlgoritm(String[] input);

}
