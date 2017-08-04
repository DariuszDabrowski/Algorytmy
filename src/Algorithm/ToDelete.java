package Algorithm;


import java.util.ArrayList;

public class ToDelete extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "To Delete";
    }

    @Override
    public void runAlgoritm(String[] input) {

        ArrayList<Integer> array = new ArrayList<>();
        Integer toDelete = Integer.parseInt(input[1]);
        int iterator = 2;
        for (int i = 0; i < input.length - 2; i++) {
            array.add(Integer.parseInt(input[iterator]));
            iterator++;
            while(array.contains(toDelete)){
                array.remove(toDelete);
            }
        }
        System.out.println(array);
    }
}
