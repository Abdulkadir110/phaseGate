public class SingleNumber {
    public static int theSingleNumberIn(int[] numbers){
        int singleNumber = 0;
        int duplicateCounter = 0;
        for (int index = 0; index < numbers.length; index++){
            duplicateCounter = 0;
            for(int secondIndex = 0; secondIndex < numbers.length; secondIndex++){
                if(numbers[index] == numbers[secondIndex]){
                    duplicateCounter++;
                }
            }
            if(duplicateCounter == 1){
                singleNumber = numbers[index];
            }
        }
        return singleNumber;
    }
}
