import Algorithm.AbstractAlgorithm;
import Algorithm.Test;

public class AlgorithmFabric {

    public AbstractAlgorithm getAlgoritm(String name) throws Exception {

        switch (name.toLowerCase()){
            case"test":
                return new Test();
            default:
                throw new Exception(("Nie ma takiego algorytmu!"));
        }

    }
}
