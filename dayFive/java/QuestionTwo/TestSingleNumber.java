import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSingleNumber{
    @Test
    public void testThatTheNumberThatAppearsOnceIsTheActualNumber(){
        //Given
        int[] numbers = {2,2,1};
        int expected = SingleNumber.theSingleNumberIn(numbers);
        int actual = 1;
        
        assertEquals(expected, actual);
    }
    @Test
    public void testThatNoNumberAppearOnce(){
        //Given
        int[] numbers = {4,1,2,1,2};
        int expected = SingleNumber.theSingleNumberIn(numbers);
        int actual = 4;
        
        assertEquals(expected, actual);
    }
}
