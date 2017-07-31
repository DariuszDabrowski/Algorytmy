package Algorithm;

public class DayInYear extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Day In Year";
    }

    @Override
    public void runAlgoritm(String[] input) throws Exception {
        int day = Integer.parseInt(input[1]);
        int mounth = Integer.parseInt(input[2]);
        int year = Integer.parseInt(input[3]);
        int maxDays = 0;
        int totalDays = 0;
        int[] daysMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        switch(mounth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                if (!(day <= maxDays)){
                   // System.out.println("Nie ma takiego dnia!");
                    throw new Exception("Nie ma takiego dnia");

                }
                break;
            case 2:
                if (isLeapYear(year)){
                    maxDays = 29;
                    if (!(day <= maxDays)){
                        //System.out.println("Nie ma takiego dnia!");
                        throw new Exception("Nie ma takiego dnia");

                    }
                } else {
                    maxDays = 28;
                    if (!(day <= maxDays)){
                        //System.out.println("Nie ma takiego dnia!");
                        throw new Exception("Nie ma takiego dnia");

                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                if (!(day <= maxDays)){
                    //System.out.println("Nie ma takiego dnia!");
                    throw new Exception("Nie ma takiego dnia");
                }
                break;
                default:
                    //System.out.println("Nie ma teakiego miesiaca!");
                    throw new Exception("Nie ma takiego miesiaca");

        }

        for (int i = 0; i < daysMonth.length; i++) {
            totalDays = daysMonth[mounth-1] + day;
        }
        if (isLeapYear(year)){
            System.out.println(totalDays+1);
        } else {
            System.out.println(totalDays);
        }
    }
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            return true;
        } else {
            return false;
        }
    }
}
