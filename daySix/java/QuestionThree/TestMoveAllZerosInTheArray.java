import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMoveAllZerosInTheArray {
    
    @Test
    public void testThatAllZerosAreMoved(){
        int [] numbers = {5,0,3,0,2,0};
        
        int[] expected = MoveAllZerosInTheArray.moveAllZerosIn(numbers);
        int[] actual = {5,3,2,0,0,0};
        assertArrayEquals(expected, actual);
    }
}
