import java.util.Scanner;

public class P02ChooseADring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double pricePerUnit = 0;

        if (profession.equals("Athlete")) {
            pricePerUnit = 0.7;
        } else if (profession.equals("Businessman") || profession.equals("Businesswoman")){
            pricePerUnit = 1;
        }else if (profession.equals("SoftUni Student")){
            pricePerUnit = 1.7;
        }else {
            pricePerUnit = 1.2;
        }
        double sum = pricePerUnit * quantity;

        System.out.println(String.format("The %s has to pay %.2f.", profession, sum));
    }
}
