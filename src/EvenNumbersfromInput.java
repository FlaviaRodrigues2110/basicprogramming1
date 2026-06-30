import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersfromInput {

    public static void main(String args[])
    {
        System.out.print("Enter your numbers separated by a space: ");
        Scanner sc = new Scanner(System.in);
        String values[] = sc.nextLine().split(" ");
        System.out.print("Values are: "+ Arrays.toString(values));
        System.out.println();
        ArrayList <Integer> all_integers = new ArrayList<>();
        for(String number: values)
        {
            try
            {
                all_integers.add(Integer.parseInt(number));
            } catch (Exception e) {
                System.out.println(number + " is not an integer/number");
            }
        }

        System.out.print("List of numbers: "+ all_integers);
        System.out.println();
        System.out.println("All Even Numbers in the List are: ");

        for (int an_even_number: all_integers)
        {
            if (an_even_number%2==0)
            {
                System.out.println(an_even_number);
            }
        }
    }
}
