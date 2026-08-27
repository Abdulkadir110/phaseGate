import java.util.Arrays;
public class AddOneToTheLastElementInTheArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,9};
        System.out.println(Arrays.toString(addOneToTheLastIn(numbers)));
    }
    public static int[] addOneToTheLastIn(int[] array) {
        int[] newArray = new int[array.length + 1];
        int lastElement = array[array.length - 1] + 1;
        if (lastElement < 10) {
            array[array.length - 1] = lastElement;
            return array;
        }
        for (int index = 0; index < array.length - 1; index++) {
            newArray[index] = array[index];
        }
        newArray[array.length - 1] = 1;
        newArray[array.length] = 0;

        return newArray;
    }
}
