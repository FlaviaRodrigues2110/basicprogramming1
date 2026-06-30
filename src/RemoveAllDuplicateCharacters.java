import java.util.*;

public class RemoveAllDuplicateCharacters {

    public static void main(String[] args)
    {
        String value = "The man is near a bakery with a potato in hand";

        Set<Character> setOfCharacters = new LinkedHashSet<>();

        for(char ch: value.toCharArray())
        {
            if(Character.isLetter(ch)|| Character.isDigit(ch))
            {
                setOfCharacters.add(ch);
            }
        }

        for(char ch: setOfCharacters)
        {
            System.out.print(ch);
        }

    }
}
