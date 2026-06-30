import java.util.*;

public class FrequencyMapPattern1 {

    public static void main(String[] args)
    {
        System.out.println("===============================================================================");
        duplicateCharacters("The hotdog is in the bakery which is near a man flying a kite123123123");
        System.out.println("===============================================================================");
        firstNonRepeatedCharacter("aaabbbccceegfh");
        System.out.println("===============================================================================");
        findAllNonRepeatedCharacters("The hotdog is in the bakery which is near a man flying a kite123123123");
        System.out.println("===============================================================================");
        checkAnagrams("listen", "silent");
        System.out.println("===============================================================================");
        checkAnagrams("listen1", "silent");
        System.out.println("===============================================================================");
    }

    public static void duplicateCharacters(String value)
    {
        Map<Character,Integer> map = frequencyCounter(value);

        System.out.println(map);

        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate Characters are "+ entry.getKey() + " = " + entry.getValue());
            }
        }
    }

    public static void firstNonRepeatedCharacter(String value)
    {
        Map<Character,Integer> map = frequencyCounter(value);

        System.out.println(map);

        for(char ch: value.toCharArray())
        {
            if(map.get(ch)==1)
            {
                System.out.println("First Occurence of Non Repeated Character:`  "+ch);
                break;
            }
        }

    }

    public static void findAllNonRepeatedCharacters(String value)
    {
        Map<Character,Integer> map = frequencyCounter(value);

        System.out.println(map);

        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("Non Repeated Characters: "+ entry.getKey() + " = "+ entry.getValue());
            }
        }
    }

    public static void checkAnagrams(String value1, String value2)
    {
        Map<Character,Integer> map1 = frequencyCounter(value1);
        Map<Character,Integer> map2= frequencyCounter(value2);

        if(map1.equals(map2))
        {
            System.out.println("It is anagram");
        }
        else
        {
            System.out.println("It is not anagram");
        }
    }

    public static Map<Character,Integer> frequencyCounter(String value)
    {
        Map<Character,Integer> map = new HashMap<>();
        for (char c: value.toCharArray())
        {
            if(Character.isDigit(c) || Character.isLetter(c))
            {
                map.put(c, map.getOrDefault(c,0)+1);
            }

        }
        return map;
    }
}
