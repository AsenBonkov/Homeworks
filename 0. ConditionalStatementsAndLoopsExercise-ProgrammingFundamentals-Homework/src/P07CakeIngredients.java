import java.util.Scanner;

public class P07CakeIngredients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bake = "Bake";




        for (int i = 1; i <= 1000; i++) {
            String ingridient = scanner.nextLine();

            if (ingridient.equals("Bake!")) {
                System.out.println(String.format("Preparing cake with %d ingredients.", i - 1));
                break;
            }

            System.out.println(String.format("Adding ingredient %s.", ingridient));
        }
    }
}
