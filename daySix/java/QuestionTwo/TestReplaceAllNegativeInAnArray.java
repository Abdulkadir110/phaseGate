import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestReplaceAllNegativeInAnArray {
    
    @Test
    public void testThatNegativeNumbersAreReplacedWithZero(){
        int [] numbers = {5,-9,3,-6,2,-11};
        
        int[] expected = ReplaceAllNegativeInAnArray.replaceNegativesIn(numbers);
        int[] actual = {5,0,3,0,2,0};
        assertArrayEquals(expected, actual);
    }
}
