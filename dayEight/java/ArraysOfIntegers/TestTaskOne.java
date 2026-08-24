import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTaskOne {
    @Test
    public void testThatTheEvensInTheArrayAreMultipliedAndOddAreIncreasedByOneInTheGivenArray(){
    //Given
    int[] numbers = {2,8,14,5,1};
    
    int[] expected = TaskOne.AddOneToEveryOddAndMultiplyEveryEvenIn(numbers);
    int[] actual = {4,16,28,6,2};
    
    assertArrayEquals(expected, actual);
    }
    @Test
    public void testThatTheNumberIsEven(){
    int number = 6;
    
    assertTrue(TaskOne.isEven(number));
    }
    @Test
    public void testThatTheNumberIsOdd(){
    int number = 5;
    
    assertTrue(TaskOne.isOdd(number));
    }
}
