import Algorithm.AbstractAlgorithm;
import Algorithm.BiednyCamelCase;
import Algorithm.Test;

public class AlgorithmFabric {

    public AbstractAlgorithm getAlgoritm(String name) throws Exception {

        switch (name.toLowerCase()){
            case"test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            default:
                throw new Exception(("Nie ma takiego algorytmu!"));
        }

    }
}
