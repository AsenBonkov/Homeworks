public class P06StringsAndObjects {
    public static void main(String[] args) {

        String hello = "Hello";
        String world = "World";


        Object obj = (hello + " " + world);
        String ch1 = (String)obj;

        System.out.println(ch1);
    }
}
