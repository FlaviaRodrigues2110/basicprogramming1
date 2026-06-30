import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class SearchNumberInDynamicList {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number_to_be_Searched;
        boolean match_found = false;
        System.out.print("Enter your numbers separated by a space: ");
        String[] values = sc.nextLine().split(" ");

        System.out.print("Enter your number to be searched: ");
        try {
                number_to_be_Searched = sc.nextInt();
            }
        catch (InputMismatchException e)
            {
                System.out.println("Not a valid Integer/Number to be searched");
                number_to_be_Searched=-1;
                exit(1);
            }
        System.out.println();
        System.out.print("All values entered are: "+ Arrays.toString(values));
        System.out.println();

        ArrayList<Integer> all_integers = new ArrayList<>();

        for (String number: values)
        {
            try
            {
                all_integers.add(Integer.parseInt(number));
            }
            catch (NumberFormatException e)
            {
                System.out.println(number+ "is not a valid Integer/Number");
            }
        }

        System.out.println();
        System.out.print("List of numbers: "+ all_integers);
        System.out.println();

        for (int number:all_integers)
        {
            if(number==number_to_be_Searched)
            {
                System.out.println("Number Found at: "+ all_integers.indexOf(number));
                match_found= true;
                break;
            }
        }
        if(!match_found)
        {
            System.out.println("Number not found");
        }
    }
}
