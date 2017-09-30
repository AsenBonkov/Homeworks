import java.util.Scanner;

public class P07ExchangeVariableValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int temp = a;

        a = b;
        b = temp;

        System.out.println(String.format("Before:%n a = %d%nb = %d%nAfter:%na = "));
    }
}
