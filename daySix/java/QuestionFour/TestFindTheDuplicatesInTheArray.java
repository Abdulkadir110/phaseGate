import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindTheDuplicatesInTheArray {
    
    @Test
    public void testThatTheNumberOfDuplicatesIsThree(){
        int [] numbers = {45,60,3,0,67,2,45,3,22,0};
        
        int expected = FindTheDuplicatesInTheArray.countNumberOfDuplicatesIn(numbers);
        int actual = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testThatTheDuplicatesArrayIsEqualToTheActualArray(){
        int [] numbers = {45,60,3,0,67,2,45,3,22,0};
        
        int[] expected = FindTheDuplicatesInTheArray.theDuplicatesIn(numbers);
        int[] actual = {45,3,0};
        assertArrayEquals(expected, actual);
    }
}
