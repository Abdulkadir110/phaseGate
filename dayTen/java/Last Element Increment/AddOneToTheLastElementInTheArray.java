import java.util.Arrays;
public class AddOneToTheLastElementInTheArray {
   public static void main(String[] args) {
        int[] numbers = {1,2,99};
        System.out.println(Arrays.toString(addTheLastElementIn(numbers)));
    }
    public static int countNumberOfTheLastElementDigits(int[] array){
        int number = array[array.length - 1] + 1;
        int digit = 0;
        int  count = 0;
        while(number != 0){
            digit = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }
    public static int[] theArrayOfTheLastDigitsIn(int[] array){
        int number = array[array.length - 1] + 1;
        int digit = 0;
        int[] digitArray = new int[countNumberOfTheLastElementDigits(array)];
        int index = 0;
        while(number != 0){
            digit = number % 10;
            digitArray[index] = digit;
            index++;
            number /= 10;
        }
        return digitArray; 
    }
    public static int[] addTheLastElementIn(int[] array){
       int[] newArray = new int[array.length + countNumberOfTheLastElementDigits(array) - 1];
       int lastElement = array[array.length - 1] + 1;
       int[] lastElementsArray = theArrayOfTheLastDigitsIn(array);
       if(lastElement < 10) {
            array[array.length - 1] = lastElement;
            return array;
       }
       for(int index = 0; index < array.length - 1; index++){
            newArray[index] = array[index];
       }
       int secondIndex = lastElementsArray.length - 1;
       for(int index = array.length - 1; index < newArray.length; index++){
            newArray[index] = lastElementsArray[secondIndex];
            secondIndex--;
       }
       return newArray;
    }
}
