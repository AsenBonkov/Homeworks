import java.util.Scanner;

public class P09CountTheIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            Object obek = scanner.nextLine();
            if (obek.equals("")){
                break;
            }
        }
    }
}
