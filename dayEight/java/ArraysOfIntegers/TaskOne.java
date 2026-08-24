public class TaskOne {

    public static boolean isEven(int number) {
       return number % 2 == 0;
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static int[] AddOneToEveryOddAndMultiplyEveryEvenIn(int[] numbers) {
        int[] newArray = new int[numbers.length];
        
        for(int index = 0; index < numbers.length; index++){
            if(isEven(numbers[index])) {
                newArray[index] = numbers[index] * 2;
            }
            else if(isOdd(numbers[index])){
                newArray[index] = numbers[index] + 1;
            }
        }
        return newArray;
    }
}
