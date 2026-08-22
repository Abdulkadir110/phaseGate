import java.util.Arrays;
public class FindTheDuplicatesInTheArray {
    public static int countNumberOfDuplicatesIn(int [] numbers){
        int duplicateCounter = 0;
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            duplicateCounter = 1;
            for(int secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
                if(numbers[index] == numbers[secondIndex]) {
                    duplicateCounter++;
                }
            }
            if(duplicateCounter > 1) {
                count++;
            }
        }
        return count;
    }
    public static int[] theDuplicatesIn(int[] numbers){
        int duplicateCounter = 0;
        int duplicateArrayIndex = 0;
        int [] duplicatesArray = new int[countNumberOfDuplicatesIn(numbers)];
        for(int index = 0; index < numbers.length; index++){
            duplicateCounter = 1;
            for(int secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
                if(numbers[index] == numbers[secondIndex]) {
                    duplicateCounter++;
                }
            }
            if(duplicateCounter > 1) {
                duplicatesArray[duplicateArrayIndex] = numbers[index];
                duplicateArrayIndex++;
               
            } 
        }
        return duplicatesArray;
    }
}

