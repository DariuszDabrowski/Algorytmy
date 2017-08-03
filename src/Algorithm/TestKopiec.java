package Algorithm;


import Struktury.Kopiec;

public class TestKopiec extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Test Kopiec";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;
        Kopiec kopiec = new Kopiec(n);

        for (int i = 1; i < input.length; i++) {
            int newElement = Integer.parseInt(input[i]);
            kopiec.insertElement(newElement);
        }
        kopiec.printHeap();
    }
}
