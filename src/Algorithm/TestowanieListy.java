package Algorithm;

import Struktury.MList;

/**
 * Created by RENT on 2017-08-01.
 */
public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Testowanie Listy";
    }

    @Override
    public void runAlgoritm(String[] input) {
        MList lista = new MList();

        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.addElementBeforeElement(13, 25, lista);
        lista.addElementAtEnd(21, lista);
        lista.addElementAfterElement(33, 13, lista);
        lista.addElementBeforeElement(99, 13, lista);
        lista.removeElement(25, lista);
        lista.removeElement(21, lista);
        lista.removeElement(99, lista);

        lista.printAllElements(lista);

    }
}
