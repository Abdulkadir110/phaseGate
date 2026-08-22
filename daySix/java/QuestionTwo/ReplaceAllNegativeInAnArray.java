public class ReplaceAllNegativeInAnArray {

    public static int[] replaceNegativesIn(int[] numbers){
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] < 0){
                numbers[index] = 0;
            }
        }
        return numbers;
    }
}
