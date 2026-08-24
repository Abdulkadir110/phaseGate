public class ArraysOfArrays {
    public static int[] addElementsInEachArraysOf(int[][] numbers){
        int[] newArray = new int [numbers.length];
        int newArrayIndex = 0;
        int total = 0;
        for(int index = 0; index < numbers.length; index++){
            total = 0;
            for(int secondIndex = 0; secondIndex < numbers[index].length; secondIndex++){
                total += numbers[index][secondIndex];
            }
            newArray[newArrayIndex] = total;
            newArrayIndex++;
        }
        return newArray;
    }
}
