public class P07ExchanveVariableValues {
    public static void main(String[] args) {

        int input1 = 5;
        int input2 = 10;

        System.out.println(String.format("Before:%na = %d%nb = %d", input1, input2));

        int reminder = input1;

        input1 = input2;
        input2 = reminder;

        System.out.println(String.format("After:%na = %d%nb = %d", input1, reminder));
    }
}
