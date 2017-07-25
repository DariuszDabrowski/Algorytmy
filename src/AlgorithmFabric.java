import Algorithm.*;

public class AlgorithmFabric {

    public AbstractAlgorithm getAlgoritm(String name) throws Exception {

        switch (name.toLowerCase()){
            case"test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumujemyliczbynaturalne":
                return new SumaLiczbNaturalnych();
            case "sumaliczb":
                return new SumaLiczb();
            case "wydanenominaly":
                return new WydaneNominaly();
            case "rokprzestepny":
                return new RokPrzestepny();
            case "silnia":
                return new Silnia();
            case "sumaliczbrekurencja":
                return new SumaLiczbRekurencja();
            case "wyznaczaniecyfr":
                return new WyznaczanieCyfr();
            case "fibonacci":
                return new Fibonacci();
            default:
                throw new Exception(("Nie ma takiego algorytmu!"));
        }

    }
}
