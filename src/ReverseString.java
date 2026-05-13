public class ReverseString {

    public static void main(String [] args)
    {
        //AutomationLead-> daeLnoitamotuA

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
    }
}
