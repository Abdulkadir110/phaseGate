public class MoveAllZerosInTheArray {
    public static int[] moveAllZerosIn(int[] numbers){
        int temp = 0;
        for(int index = 0; index < numbers.length; index++){
            for(int secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
                if(numbers[index] < numbers[secondIndex]){
                    temp = numbers[index];
                    numbers[index] = numbers[secondIndex];
                    numbers[secondIndex] = temp;
                }
            }
        }
        return numbers;
    }
}
