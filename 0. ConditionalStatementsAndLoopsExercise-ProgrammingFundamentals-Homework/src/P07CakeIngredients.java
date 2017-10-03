
public class P07CakeIngredients {
    public static void main(String[] args) {


        long number = int.Parse(Console.ReadLine());
        try
        {

            Console.WriteLine($"{number} can fit in:");
            if (number >= sbyte.MinValue && number <= sbyte.MaxValue)
            {
                Console.WriteLine("* sbyte");
            }
            if (number >= byte.MinValue && number <= byte.MaxValue)
            {
                Console.WriteLine("* byte");
            }
            if (number >= short.MinValue && number <= short.MaxValue)
            {
                Console.WriteLine("* short");
            }
            if (number >= ushort.MinValue && number <= ushort.MaxValue)
            {
                Console.WriteLine("* ushort");
            }
            if (number >= int.MinValue && number <= int.MaxValue)
            {
                Console.WriteLine("* int");
            }
            if (number >= uint.MinValue && number <= uint.MaxValue)
            {
                System.out.println(("* uint"));
            }
            if (number >= long.MinValue && number <= long.MaxValue)
            {
                System.out.println(("* long"));
            }
        }
        catch (Exception)
        {
            System.out.printf("%d can't fit in any type", number);
        }
    }
}
