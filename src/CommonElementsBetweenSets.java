import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElementsBetweenSets {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the list of integers you want in List 1: ");
        String [] values1 = sc.nextLine().split(" ");
        System.out.print("Enter the list of integers you want in List 2: ");
        String [] values2 = sc.nextLine().split(" ");

        ArrayList<Integer> list1 = add_numbers_to_list(values1);
        ArrayList<Integer> list2 = add_numbers_to_list(values2);

        System.out.println();
        System.out.println("List 1: "+list1);
        System.out.println("List 2: "+list2);
        System.out.println();

        Set<Integer> unique_set1 = new LinkedHashSet<>();
        Set<Integer> unique_set2 = new LinkedHashSet<>();

        unique_set1.addAll(list1);
        unique_set2.addAll(list2);

        System.out.println();
        System.out.println("Set 1: "+unique_set1);
        System.out.println("Set 2: "+unique_set2);
        System.out.println();
        unique_set1.retainAll(unique_set2);
       System.out.println("Common Elements between 2 sets: " +unique_set1);

    }

    public static ArrayList<Integer> add_numbers_to_list(String [] values)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(String number:values)
        {
            try
            {
                numbers.add(Integer.parseInt(number));
            }
            catch (NumberFormatException e)
            {
            }
        }
        return numbers;
    }
}
