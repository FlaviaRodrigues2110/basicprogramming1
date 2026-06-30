import java.util.*;

public class RemoveDuplicatesfromSet {

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

            System.out.println();
            System.out.print("List of List numbers: "+ all_integers);
            System.out.println();

        Set<Integer> set_from_list = new HashSet<>();
        set_from_list.addAll(all_integers);

        System.out.println();
        System.out.print("List of Set numbers: "+ set_from_list);
        System.out.println();

        }
}
