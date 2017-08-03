package Algorithm;


import java.util.Stack;

public class PrzeliczanieSystemowLiczbowych extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Przeliczanie Systemow Liczbowych";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<Integer> s = new Stack<>();
        int liczba = Integer.parseInt(input[1]);
        int podstawa = Integer.parseInt(input[2]);


        while (liczba > 0){
            s.push(liczba % podstawa);
            liczba = liczba / podstawa;
        }
        while(!(s.empty())){
            s.peek();

            System.out.printf("%d ",s.pop());
        }
       // System.out.println(s);

    }
}
