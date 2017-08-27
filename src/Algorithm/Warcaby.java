package Algorithm;

public class Warcaby extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Warcaby";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        String color = input[3].toUpperCase();
        int counter = 0;
        if (color.equals("B")) {
            counter = 1;
        }


        String[][] plansza = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 && j==0){
                    plansza[i][j] = color;
                } else if(j==0) {
                    if(plansza[i-1][j].equals("B")){
                        plansza[i][j]="C";
                        counter=0;
                    } else {
                        plansza[i][j]="B";
                        counter = 1;
                    }
                } else {
                    if (counter%2==0) {
                        plansza[i][j] = "C";
                    } else {
                        plansza[i][j]="B";
                    }
                }
                    counter++;
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(plansza[i][j]+" ");
            }
            System.out.println();
        }

    }
}
