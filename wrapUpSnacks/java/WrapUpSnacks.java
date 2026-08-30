public class WrapUpSnacks {
    public static int factorialOf(int number) {
        int factorial = 1;
        for(int index = number; index >= 1; index--){
            factorial *= index;
        }
        return factorial;
    }
    public static int greatestCommonDivisorOf(int firstNumber, int secondNumber){
        int divisor = 1;
        int commonDivisor = 0;
        while (divisor <= firstNumber || divisor <= secondNumber){
            if(firstNumber % divisor == 0 && secondNumber % divisor == 0){
                commonDivisor = divisor;
            }
            divisor++;
        }
        return commonDivisor;
    }
    public static int lowestCommonMultipleOf(int firstNumber, int secondNumber){
        int commonDivisor = greatestCommonDivisorOf(firstNumber, secondNumber);
        return (firstNumber * secondNumber) / commonDivisor;
    }
    public static int countNumberOfDigitsIn(int number){
        int count = 0;
        while(number != 0){
            int digit = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        int factor = 1;
        while(factor < number){
            if(number % factor == 0){
                sum += factor; 
            }
            factor++;
        }
        return sum == number;
    }
    public static boolean isStrongNumber(int number){
        int givenNumber = number; 
        int sum = 0;
        while(number != 0){
            int digit = number % 10;
            sum += factorialOf(digit);
            number /= 10;
        }
        return sum == givenNumber;
    }
    public static boolean isArmstrong(int number){
        int givenNumber = number;
        int exponient = countNumberOfDigitsIn(number);
        double sum = 0;
        while(number != 0){
            int digit = number % 10;
            sum = sum + Math.pow(digit, exponient);
            number /= 10;
        }
        return sum == givenNumber;
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                return true;
            }
        }
        return false;
    }
}
