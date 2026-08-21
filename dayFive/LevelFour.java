public class LevelFour {
    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static boolean evenCheck(int number){
        return (number % 2 == 0);
    }
    public static int squareOf(int number){
        return number **2;
    }
    public static double toFahrenheit(double celsius){
        return (1.8 * celsius) + 32;
    }
    public static boolean isPrime(int number){
        int primecounter = 0;
        for(int index = 1; index <= number; index++){
            if(number % index == 0){
                primecounter++;
            }
        }
        if(primecounter == 2) {
                return true;
        } 
        return false;
    }
    public static int largestIn(int firstNumber, int secondNumber, int thirdNumber){
        int largest = 0;
        if(firstNumber >= secondNumber && secondNumber >= thirdNumber){
            largest = firstNumber;
        }
        else if(firstNumber >= thirdNumber && thirdNumber >= secondNumber){
            largest = firstNumber;
        }
        else if(secondNumber >= firstNumber && firstNumber >= thirdNumber) {
            largest = secondNumber;
        }
        else if(secondNumber >= thirdNumber && thirdNumber >= firstNumber){
            largest = secondNumber;
        }
        else if(thirdNumber >= firstNumber && firstNumber >= secondNumber) {
            largest = thirdNumber;
        }
        else {
            largest = thirdNumber;
        }
        return largest;
    }
    public static double simpleInterestOf(double principal, double rate, double time){
        rate = rate / 100;
        double interest = (principal * rate * time) / 100;
        return interest;
    }
    public static double areaOfTheRectangle(double length; double breath){
        return length * breath;
    }
    public static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return reverse;
    }
    public static int countTheNumberOfOccurrenceOf(String word, char character) {
        int duplicateCounter = 0;
        for(int index = 0; index < word.length(); index++){
            if(word.charAt(index) == character){
                 duplicateCounter++;
            }
        }
        return duplicateCounter;
    }
    
}
