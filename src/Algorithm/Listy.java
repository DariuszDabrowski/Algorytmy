package Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-08-01.
 */
public class Listy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Listy";
    }

    @Override
    public void runAlgoritm(String[] input) {
            List<String> lista = new ArrayList<>();
        lista.add("niebieski");
        lista.add("czarny");
        lista.add("żółty");
        lista.add("fioletowy");
        lista.add(0,"pink");
        lista.add(5,"green");

        //System.out.println(lista);
        for (String el: lista){
            System.out.println(el);
        }
    }
}
