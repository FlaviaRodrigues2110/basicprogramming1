import java.util.*;

public class UserNameValidationSystem {

    public static void main(String[] args)
    {
        boolean space_found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user_name = sc.nextLine();

        if(user_name.equals(""))
        {
            System.out.println("Username is invalid");
        }
        else if(user_name.length()<4)
        {
            System.out.println("Username is too short");
        }
        else
        {
            for(int i = 0; i<user_name.length();i++)
            {
                if(user_name.charAt(i)== ' ')
                {
                    System.out.println("Space is present in the user name which is invalid");
                    space_found=true;
                    break;
                }
            }
        }

        if(!space_found)
        {
            System.out.println("Valid Username");
        }
    }
}
