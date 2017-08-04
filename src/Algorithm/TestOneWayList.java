package Algorithm;

import Struktury.OneWayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class TestOneWayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Test My Litle List";
    }

    @Override
    public void runAlgoritm(String[] input) {
        OneWayList list = new OneWayList();

        list.addElementAtBegin(23);
        list.addElementAtBegin(34);
        list.addElementAtEnd(12);
        list.addElementAfterElement(66, 23);

        list.printOneWayList();
    }
}
