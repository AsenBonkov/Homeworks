import java.util.Scanner;

public class P11ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        float second = (hours * 3600) + (minutes * 60) + seconds;
        float minute = second / 60;
        float hour = second / 3600;
        double miles = (meters * 0.001) / 1.609;


        float metersPerSecond = meters / second;
        double kmph = (meters * 0.001) / hour;
        float milesPerHour = (float) miles / hour;


        System.out.printf("%07f%n", metersPerSecond);
        System.out.printf("%07f%n", kmph);
        System.out.printf("%07f", milesPerHour);
    }
}
