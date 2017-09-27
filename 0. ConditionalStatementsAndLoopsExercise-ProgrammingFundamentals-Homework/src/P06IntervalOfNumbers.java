import java.util.Scanner;

public class P06IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }
        }else if (firstNumber > secondNumber){
            for (int i = secondNumber; i <= firstNumber; i++) {
                System.out.println(i);
            }

        }

    }
}
