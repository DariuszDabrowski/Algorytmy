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
            case "szyfrcezara":
                return new SzyfrCezara();
            case "sortowaniebabelkowe":
                return new SortowanieBabelkowe();
            case "sortowaniepunktow":
                return new SortowaniePunktow();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();
            case "krzyzowka":
                return new Krzyzowka();
            case "obzartuchy":
                return new Obzartuchy();
            case "najwiekszywspolnydzielnik":
                return new NajwiekszyWspolnyDzielnik();
            case "warcaby":
                return new Warcaby();
            case "dominanta":
                return new Dominanta();
            case "punkty":
                return new Punkty();
            case "wielkanoc":
                return new Wielkanoc();
            case "tablice":
                return new Tablice();
            case "wyszukanieminmax":
                return new WyszukanieMinMax();
            case "lider":
                return new Lider();
            case "testowanielisty":
                return new TestowanieListy();
            case "listy":
                return new Listy();
            default:
                throw new Exception(("Nie ma takiego algorytmu!"));
        }

    }
}
