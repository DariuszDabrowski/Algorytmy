package Algorithm;


public class Tree extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Tree";
    }
    String _tree[];
    int _level;
    int _height;
    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length-1;
        _tree = new String[n];
        int i;
        for (i = 0; i < n; i++) {
            _tree[i] = input[i+1];
        }


        //System.out.printf("Poziom drzewa: %d \n", _level);
        //System.out.printf("Wysokość drzewa: %d \n ", _height);
        getLevel(n);
        System.out.println();
        System.out.printf("Korzeniem jest: %s\n", _tree[0]);

        for (int j = 0; j < _tree.length; j++) {

            String elementLewy;

            String element = "";
            try{
                element = _tree[j];
                elementLewy = _tree[2*j+1];


            } catch (Exception ex) {
                System.out.println("Element " + element + " jest liściem.\n");
            }
        }
        getSons("E");

    }

    private void getLevel(int n) {
        int currentSize = 0;
        int iterator = 0;
        do{
            currentSize = currentSize + (int)Math.pow(2d, (double) iterator);
            iterator++;
        } while(currentSize < n);

        _level = _height = iterator - 1;
        System.out.printf("Poziom: %d \n Wysokość: %d ", _level, _height);

    }
    private void getSons(String father){
        int i = 0;
        for (i = 0; i < _tree.length; i++) {
            if (_tree[i].equals(father))
                break;
        }
        try{
            System.out.printf("Lewym synem elementu %s jest %s\n", _tree[i], _tree[2*i+1]);
            System.out.printf("Prawym synem elementu %s jest %s\n", _tree[i], _tree[2*i+2]);
        } catch (Exception ex) {
            System.out.printf("Element %s nie posiada syna", _tree[i]);
        }
    }
}
