import java.util.*;

public class ArraysPrograms {

    public static void main(String[] args)
    {
        System.out.println("===============================================================================");
        reverseArray(new int[]{1, 2, 3, 4});
        System.out.println("===============================================================================");
        reverseArray(new int[]{40, 20, 30, 40});
        System.out.println("===============================================================================");
        findDuplicateElements(new int[]{90,80,10,10,20,30,40,90,80,90,90});
        System.out.println("===============================================================================");
        removeDuplicates(new int[]{90,80,10,10,20,30,40,90,80,90,90});
        System.out.println("===============================================================================");
    }

    public static void reverseArray(int [] values)
    {
        int [] reversedArray=new int[values.length];
        for(int i=values.length-1;i>=0;i--)
        {
            reversedArray[(values.length-1)-i]=values[i];
        }
        System.out.println("Reversed Array: ");
        for(int i:reversedArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void findDuplicateElements(int [] values)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : values)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        System.out.println("Duplicate Elements: ");
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+ " ");
            }
        }
        System.out.println();
    }

    public static void removeDuplicates(int [] values)
    {
        Set<Integer> setofUniqueNumbers = new HashSet<>();

        for(int i: values)
        {
            setofUniqueNumbers.add(i);
        }
        System.out.println("Unique Elements: ");

        for(int i: setofUniqueNumbers)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
