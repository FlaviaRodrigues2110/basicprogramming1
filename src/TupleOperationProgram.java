
import java.util.*;

public class TupleOperationProgram {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbers separated by a space: ");
        String[] values = sc.nextLine().split(" ");

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
        List<Integer> finalList = List.copyOf(all_integers);
        if(finalList.size()>0) {
            System.out.print("List of List numbers: " + finalList);
            System.out.println();
            System.out.println("First Element: " + finalList.get(0));
            System.out.println();
            System.out.println("Last Element: " + finalList.get(finalList.size() - 1));
            System.out.println();
            System.out.println("Total Elements: " + finalList.size());
            int count = 0;
            System.out.print("Enter your number which you want to search: ");
            int number = sc.nextInt();
            System.out.println("Your target number " + number + " appears " + Collections.frequency(finalList, number) +
                    " time/times in the list");
        }
        else
        {
            System.out.println("Empty List");
        }
        }

}
