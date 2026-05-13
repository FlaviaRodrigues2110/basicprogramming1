public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber)
    {

        long firstNumberLong = (long)(firstNumber*1000);
        long secondNumberLong = (long)(secondNumber*1000);

        System.out.println(firstNumberLong);
        System.out.println(secondNumberLong);
        double roundedFirstNumber = (double) firstNumberLong/1000.0;
        double roundedSecondNumber = (double) secondNumberLong/1000.0;
        System.out.println(roundedFirstNumber);
        System.out.println(roundedSecondNumber);
        if(roundedFirstNumber==roundedSecondNumber)
        {
            return true;
        }

        return false;
    }
}