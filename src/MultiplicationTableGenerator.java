import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.exit;

public class MultiplicationTableGenerator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number whose multiplication you need: ");
        try
        {
            number= sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            number=-1;
            System.out.println("Not a valid number");
            exit(1);
        }

        for(int i =1;i<=10;i++)
        {
            int ans = number*i;
            if(ans>=40)
            {
                break;
            }
            else {
                System.out.println(number + " x " + i + " = " + ans);
            }


        }
    }
}
