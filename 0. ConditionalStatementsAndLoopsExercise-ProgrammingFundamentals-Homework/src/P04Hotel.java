import java.util.Scanner;

public class P04Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double discount = 1;
        double priceForStudio = 0;
        double priceForDouble = 0;
        double priceForSuite = 0;

        if (month.equals("May") || month.equals("October")) {
            priceForStudio = 50;
            priceForDouble = 65;
            priceForSuite = 75;
            if (nightsCount > 7) {
                priceForStudio = 50 * 0.95;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceForStudio = 60;
            priceForDouble = 72;
            priceForSuite = 82;
            if (nightsCount > 14) {
                priceForDouble = 72 * 0.9;
            }
        } else if (month.equals("July") || month.equals("August") || month.equals("December")) {
            priceForStudio = 68;
            priceForDouble = 77;
            priceForSuite = 89;
            if (nightsCount > 14) {
                priceForSuite = priceForSuite * 0.85;
            }
        }


        if (month.equals("September") && nightsCount > 7){
            System.out.println(String.format("Studio: %.2f lv.", (priceForStudio * nightsCount) - 60));
        }else if (month.equals("October") && nightsCount > 7){
            System.out.println(String.format("Studio: %.2f lv.", (priceForStudio * nightsCount) - 50));
        }else {
            System.out.println(String.format("Studio: %.2f lv.", priceForStudio * nightsCount));
        }
        System.out.println(String.format("Double: %.2f lv.", priceForDouble * nightsCount));
        System.out.println(String.format("Suite: %.2f lv.", priceForSuite * nightsCount));

    }

}
