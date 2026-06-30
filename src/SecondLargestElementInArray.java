public class SecondLargestElementInArray {

    public static void main(String[] args)
    {
        int arrayToBeDetermined[] = {2,1};
        int largestNumber=Integer.MIN_VALUE;
        int secondLargestNumber=Integer.MIN_VALUE;
        for(int i=0;i<(arrayToBeDetermined.length);i++)
        {
            int verification = arrayToBeDetermined[i];
            if(verification>largestNumber)
            {
                secondLargestNumber=largestNumber;
                largestNumber=verification;

            }

            if(verification<largestNumber && verification>secondLargestNumber)
            {
                secondLargestNumber=verification;
            }
        }

        System.out.println("Second Largest Number: "+ secondLargestNumber);
        System.out.println("Largest Number : "+largestNumber);
    }
}
