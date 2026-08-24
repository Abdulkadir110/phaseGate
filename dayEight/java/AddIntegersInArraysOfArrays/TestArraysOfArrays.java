import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArraysOfArrays {
    @Test
    public void testThatAllElementsAreAdded(){
    //Given
    int[][] numbers = {{3,5,7}, {2,2,2},{4,1,9}};
    int[] expected = ArraysOfArrays.addElementsInEachArraysOf(numbers);
    int[] actual = {15,6,14};
    assertArrayEquals(expected, actual);
    }
    @Test
    public void testThatAllElementsAreAddedTwo(){
    //Given
    int[][] numbers = {{3,9}, {2,8},{0,6}};
    int[] expected = ArraysOfArrays.addElementsInEachArraysOf(numbers);
    int[] actual = {12,10,6};
    assertArrayEquals(expected, actual);
    }
}
