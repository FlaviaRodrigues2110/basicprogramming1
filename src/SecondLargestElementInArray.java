public class SecondLargestElementInArray {

    public static void main(String[] args)
    {

        int arrayToBeDetermined[] = {98,45,98,23,67};
        int largestNumber=Integer.MIN_VALUE;
        int secondLargestNumber=Integer.MIN_VALUE;
        for(int i=0;i<(arrayToBeDetermined.length);i++)
        {

            int verification = arrayToBeDetermined[i];
            if(verification>largestNumber)
                {
                    largestNumber=verification;
                }
            int secondVerification = arrayToBeDetermined[i];
            if((secondVerification>secondLargestNumber) &&(secondVerification<largestNumber))
            {
                secondLargestNumber=secondVerification;
            }

        }

        System.out.println("Second Largest Number: "+ secondLargestNumber);
        System.out.println("Largest Number : "+largestNumber);
    }
}
