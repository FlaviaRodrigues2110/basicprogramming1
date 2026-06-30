import java.util.*;

public class CountingVowelsAndConsonants {

    public static void main(String[] args)
    {
       method1();
       method2();
    }

    //Method 1-> use of for loops
    public static void method1()
    {
        int vowelsCount =0;
        int consontantCount =0;
        String value1= "Hotdog in the bakery where than Man was flyIng Kite";
        String value1strippingoffspaces=value1.replaceAll(" ","");

        for(int i=0;i<value1strippingoffspaces.length();i++)
        {
            if("aeiouAEIOU".contains(""+value1strippingoffspaces.charAt(i)))
            {
                vowelsCount++;
            }
            else
            {
                    consontantCount++;
            }
        }

        System.out.println("There are "+ vowelsCount+ " vowels and "+consontantCount+
                " consonants in String "+value1);

    }

    //Method 2-> use HashMap

    public static void method2()
    {
        int vowelsCount =0;
        int consontantCount =0;
        String value1= "Hotdog in the bakery where than Man was flyIng Kite";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : value1.toCharArray())
        {
            if(Character.isLetter(c))
            {
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            char ch = entry.getKey();
            int count = entry.getValue();
            if("aeiouAEIOU".contains(String.valueOf(ch)))
            {
                vowelsCount+=count;
            }
            else
            {
                consontantCount+=count;
            }
        }

        System.out.println("Character Frequency = " + map);
        System.out.println("Number of Vowels in the string are " +vowelsCount);
        System.out.println("Number of Consontant in the string are " +consontantCount);

    }
}
