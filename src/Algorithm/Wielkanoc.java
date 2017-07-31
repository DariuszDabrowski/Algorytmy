package Algorithm;


public class Wielkanoc extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Wielkanoc";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int a, b, c, d, e, f, g, h, i, k, l, m, p;
        int rok = Integer.parseInt(input[1]);
        int dzien;
        int miesiac;
        String miesiacStr;

        a = rok % 19;
        b = (int) rok / 100;
        c = rok % 100;
        d = (int) b / 4;
        e = b % 4;
        f = (int) ((b+8)/25);
        g = (int) ((b-f+1)/3);
        h = (19*a+b-d-g+15) % 30;
        i = (int) c % 4;
        k = c % 4;
        l = (32+2*e+2*i-h-k) % 7;
        m = (int) (a+11*h+22*l) / 451;
        p = (h+l-7*m+114) % 31;

        dzien = p + 1;
        miesiac = (int) (h+l-7*m+114) / 31;
        if (miesiac == 4){
            miesiacStr = "kwiecien";
        } else {
            miesiacStr = "marzec";
        }
        System.out.printf("%d %s %d",dzien, miesiacStr, rok);
    }
}
