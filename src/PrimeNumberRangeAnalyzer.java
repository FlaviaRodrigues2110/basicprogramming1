public class PrimeNumberRangeAnalyzer {
/*2️⃣ Prime Number Range Analyzer

Given two numbers (start, end):

Print all prime numbers

Count total primes

Print largest prime in range*/

    public static void main(String[] args) {
        int start = 3;
        int end = 68;
        int count = 0;
        int savedNumber = 0;
        boolean isPrime;

        System.out.print("All Prime Numbers in the Range are: ");
        for (int i = start; i <= end; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) // better way j=2;j*j<=i;j++
            {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
                if (savedNumber < i) {
                    savedNumber = i;
                }
            }
        }

        System.out.println();
        System.out.println("Total Prime Numbers in the Range: " + count);
        System.out.println("Largest Prime Number in the Range: " + savedNumber);
    }


    public static void method1() {
        int dayOfWeek = 7;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid Day";

        };
    }
}