package Struktury;


public class Kopiec {

    private int[] _data;
    private int counter = 0;

    public Kopiec(int n){
        _data = new int[n];
    }

    public void insertElement(int element) {

        int i = counter;
        counter++;
        int j = Math.floorDiv(i-1, 2);

        while(i > 0 && _data[j] < element){
            _data[i] = _data[j];
            i = j;
            j = Math.floorDiv(i-1, 2);
        }
        _data[i] = element;

    }

    public void printHeap(){
        for (int i = 0; i < _data.length; i++) {
                System.out.printf("%d  ", _data[i]);

        }
    }

}
