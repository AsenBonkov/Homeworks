import java.util.Scanner;

public class P03RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String combo = scanner.nextLine();

        double discout = 0;
        int price = 0;
        int priceForCombo = 0;

        if (groupSize <= 50){
            price = 2500;
            System.out.println("We can offer you the Small Hall");
        }else if (groupSize > 50 && groupSize <=100){
            price = 5000;
            System.out.println("We can offer you the Terrace");
        }else if (groupSize > 100 && groupSize <= 120){
            price = 7500;
            System.out.println("We can offer you the Great Hall");
        }else {
            System.out.println("We do not have an appropriate hall.");
        }

        if (combo.equals("Normal")){
            priceForCombo = 500;
            discout = 0.95;
        }else if (combo.equals("Gold")){
            priceForCombo = 750;
            discout = 0.9;
        }else if (combo.equals("Platinum")){
            priceForCombo = 1000;
            discout = 0.85;
        }

        double finalPrice = (price + priceForCombo) * discout;
        if (groupSize <= 120) {
            System.out.println(String.format("The price per person is %.2f$", finalPrice / groupSize));
        }
    }
}
