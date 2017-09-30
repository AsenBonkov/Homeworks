import java.util.Scanner;

public class P09CountTheIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1;

        try {
            while (true){
                int n = Integer.parseInt(scanner.nextLine());
                i++;
            }
        }catch (Exception n){
            System.out.println(i-1);
        }


    }
}
