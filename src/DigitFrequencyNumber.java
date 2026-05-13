public class DigitFrequencyNumber {

    public static void main(String[] args)
    {
        int number =112198713;
        int counter_zero=0, counter_one =0,counter_two=0,counter_three=0,counter_four=0,counter_five=0;
        int counter_six=0,counter_seven =0, counter_eight=0, counter_nine=0;

        while(number!=0)
        {
            int digit = number%10;
            switch(digit)
            {
                case 0: counter_zero++;
                        break;
                case 1: counter_one++;
                    break;
                case 2: counter_two++;
                    break;
                case 3: counter_three++;
                    break;
                case 4: counter_four++;
                    break;
                case 5: counter_five++;
                    break;
                case 6: counter_six++;
                    break;
                case 7: counter_seven++;
                    break;
                case 8: counter_eight++;
                    break;
                case 9: counter_nine++;
                    break;
            }
            number=number/10;
        }

        System.out.println("1 --->"+ counter_one + " times");
        System.out.println("2 --->"+ counter_two + " times");
        System.out.println("3 --->"+ counter_three + " times");
        System.out.println("4 --->"+ counter_four + " times");
        System.out.println("5 --->"+ counter_five + " times");
        System.out.println("6 --->"+ counter_six + " times");
        System.out.println("7 --->"+ counter_seven + " times");
        System.out.println("8 --->"+ counter_eight + " times");
        System.out.println("9 --->"+ counter_nine + " times");
        System.out.println("0 --->"+ counter_zero + " times");


    }
}
