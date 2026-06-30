public class NumberPyramidWithTwist {

   public static void main(String[] args)
   {
       int n =5;
       for(int i =1;i<=n;i++)
       {
           for(int j =1;j<i;j++)
           {
               System.out.print(j);
           }
        System.out.println();

       }

       for(int k=n;k>=1;k--)
       {
           for (int l=1;l<=k;l++)
           {
               System.out.print(l);
           }
           System.out.println();
       }
    System.out.println(sumFirstAndLastDigit(9,9));
   }


    public static boolean sumFirstAndLastDigit(int number1, int number2) {
        if(number1<10 || number1>99 && number2<10 || number2>99) return false;

        if((number1/10 == number2/10) ||
                (number1%10 == number2/10) ||
                (number1/10==number2%10) ||
                (number1%10== number2%10))
        return true;

        return false;
    }
}
