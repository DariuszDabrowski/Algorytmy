import Algorithm.*;

public class AlgorithmFactory {

    public AbstractAlgorithm getAlgoritm(String name) throws Exception {

        switch (name.toLowerCase()){
            case"test":
                return new Test();
            case "biednycamelcase":
                return new PoorCamelCase();
            case "sumujemyliczbynaturalne":
                return new SumaLiczbNaturalnych();
            case "sumaliczb":
                return new SumaLiczb();
            case "wydanenominaly":
                return new WydaneNominaly();
            case "rokprzestepny":
                return new RokPrzestepny();
            case "spacjecamelcase":
                return new SpacjeCamelCase();
            case "punkty":
                return new Punkty();
            case "dayinyear":
                return  new DayInYear();
            case "lider":
                return new Lider();
            default:
                throw new Exception(("Nie ma takiego algorytmu!"));
        }

    }
}
