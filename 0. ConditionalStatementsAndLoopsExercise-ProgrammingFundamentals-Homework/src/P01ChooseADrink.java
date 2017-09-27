import java.util.Scanner;

public class P01ChooseADrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();

        if (drink.equals("Athlete")) {
            System.out.println("Water");
        }
        else if (drink.equals("Businessman") || drink.equals("Businesswoman")){
            System.out.println("Coffee");
        }else if (drink.equals("SoftUni Student")){
            System.out.println("Beer");
        }else {
            System.out.println("Tea");
        }
    }
}
