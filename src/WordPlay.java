public class WordPlay {

    public static void main(String[] args)
    {
        System.out.println("===============================================================================");
        numberOfWords("Hotdog in the bakery where than Man was flyIng Kite");
        System.out.println("===============================================================================");
        reverseString("Hotdog in the bakery where than Man was flyIng Kite");
        System.out.println("===============================================================================");


    }

    public static String[] numberOfWords(String value)
    {
        String [] words = value.split(" ");
        System.out.println(words.length);
        return words;
    }

    public static void reverseString(String value)
    {
        StringBuilder reversedWordString = new StringBuilder();
        String [] words = numberOfWords(value);

        for(String word: words)
        {
            reversedWordString.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(reversedWordString);
    }
}
