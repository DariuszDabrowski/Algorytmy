package Algorithm;


public class RokPrzestepny extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Rok Przestepny";
    }

    @Override
    public void runAlgoritm(String[] input) {



        for (int i=1; i < input.length; i++) {
            int year = Integer.parseInt(input[i]);
            if ((year % 4==0 && year % 100 !=0) || (year % 400 == 0)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }

        }

    }
}
