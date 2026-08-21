import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddDigits{
    @Test
    public void testThatAddTheDigitsIsEqualToValidOutput(){
        //Given
        int number = 38;
        int expected = AddDigits.addTheDigits(number);
        int actual = 2;
        
        assertEquals(expected, actual);
    }
    @Test
    public void testThatZeroIsEqualToZero(){
        //Given
        int number = 0;
        int expected = AddDigits.addTheDigits(number);
        int actual = 0;
        
        assertEquals(expected, actual);
    }
}
