import java.util.Scanner;

public class P04VariableInHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ch1 = scanner.nextLine();
        System.out.println(Integer.parseInt(ch1.substring(2), 16));


    }
}
