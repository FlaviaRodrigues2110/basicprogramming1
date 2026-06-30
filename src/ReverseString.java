public class ReverseString {

    public static void main(String [] args)
    {
        //AutomationLead-> daeLnoitamotuA

        // First method without stripping off spaces

        String toBeReversed = "madam";
        String reversed="";
        for(int i=toBeReversed.length()-1;i>=0;i--)
        {
            char reverseParsing = toBeReversed.charAt(i);
            reversed= reversed+reverseParsing;
        }

        System.out.println("Reversed String = "+reversed);

        if(reversed.equals(toBeReversed))
        {
            System.out.println("This is a Palindrome Word or Sentence");
        }
        else
        {
            System.out.println("This is NOT a Palindrome Word or Sentence");
        }


        // Second method stripping off spaces so the sentence is considered

        String sentencetobeReversed = " The man is a dog";
        String reversedSentence = "";

        String sentencestrippedoffspaces = sentencetobeReversed.replaceAll(" ","");

        for(int i=sentencestrippedoffspaces.length()-1;i>=0;i--)
        {
            char sentenceChar = sentencestrippedoffspaces.charAt(i);
            reversedSentence=reversedSentence+sentenceChar;
        }

        System.out.println(reversedSentence);

        //Third Method String Builder

        String wordtobereversed = "The man is bad";
        StringBuilder sc = new StringBuilder(wordtobereversed);
        System.out.println(sc.reverse());
    }
}
