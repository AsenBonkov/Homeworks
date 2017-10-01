import java.math.BigDecimal;
import java.util.Scanner;

public class P10CenturiesToNanoSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years = centuries * 100;
        double days = years * 365.2422;
        int hours = (int)days * 24;
        int minutes = hours * 60;
        BigDecimal seconds = new BigDecimal(minutes * 60);


    }
}
