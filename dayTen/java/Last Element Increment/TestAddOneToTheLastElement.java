import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAddOneToTheLastElement {
    @Test
    public void testToCountTheNumberOfDigitsOfTheLastElementAfterAddedOneToIt() {
        int[] numbers = {1,3,9};
        int expectedNumber = AddOneToTheLastElementInTheArray.countNumberOfTheLastElementDigits(numbers);
        int actualNumber = 2;
        
        assertEquals(expectedNumber, actualNumber); 
    }
    @Test
    public void testThatWhenTheLastElementIncreasedByOneIsGreaterThanTenTheDigitsAreSplittedInToAnArray() {
        int[] numbers = {1, 2, 99};
        int[] expectedArray = AddOneToTheLastElementInTheArray.theArrayOfTheLastDigitsIn(numbers);
        int[] actualArray = {0,0,1};
        
        assertArrayEquals(expectedArray, actualArray); 
    }
    @Test
    public void testThatTheDigitsArrayIsAttachedToTheInitalArray(){
        int[] numbers = {1,2,9};
        int[] expectedArray = AddOneToTheLastElementInTheArray.addTheLastElementIn(numbers);
        int[] actualArray = {1,2,1,0};
        
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void testThatTheDigitsArrayForNightyNineAsLastElementIsAttachedToTheInitalArray(){
        int[] numbers = {1,2,99};
        int[] expectedArray = AddOneToTheLastElementInTheArray.addTheLastElementIn(numbers);
        int[] actualArray = {1,2,1,0, 0};
        
        assertArrayEquals(expectedArray, actualArray);
    }
}
