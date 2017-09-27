import java.util.Scanner;

public class P08CaloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int calories = 0;

        for (int i = 1; i <= n; i++) {
            String product = scanner.nextLine();
            if (product.equalsIgnoreCase("Cheese")){
                calories += 500;
            }else if (product.equalsIgnoreCase("Tomato sauce")){
                calories += 150;
            }else if (product.equalsIgnoreCase("Salami")){
                calories += 600;
            }else if (product.equalsIgnoreCase("Pepper")){
                calories += 50;
            }
        }
        System.out.println(String.format("Total calories: %d", calories));
    }
}
