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

    public int removeElement() {
       // int n = counter;
        int root = _data[0];
        if (counter == 0){return  0;} else {
            counter--;
            int v = _data[counter];
            int i = 0;
            int j = 1;

            while (j < counter) {
                if ((j + 1 < counter) && (_data[j + 1] > _data[j])) {
                    j = j + 1;
                }
                if (v >= _data[j]) {
                    break;
                } else {
                    _data[i] = _data[j];
                    i = j;
                    j = 2 * j + 1;
                }
            }
            _data[i] = v;
        }
        return root;
    }

    public void printHeap(){
        for (int i = 0; i < _data.length; i++) {
                System.out.printf("%d  ", _data[i]);

        }
    }

}
