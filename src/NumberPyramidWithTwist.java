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

   }

}
