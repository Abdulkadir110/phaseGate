import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSortedArrayOfPrimes {
    @Test
    public void testToCheckIfANumberisPrime() {
        int number  = 5;
        
        assertTrue(SortedArrayOfPrimes.isPrime(number));
    }
    
    @Test
    public void testThatTheGivenArrayIsSorted() {
        int[] numbers  = {5,3,7,8,1,9};
        
        int[] expected = SortedArrayOfPrimes.sortedArrayOf(numbers);
        int[] actual = {1,3,5,7,8,9};
        
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testThatArrayIsAnArrayOfPrimesNumbers() {
        int[] numbers  = {5,3,7,8,1,9};
        
        int[] expected = SortedArrayOfPrimes.arraysOfPrimesIn(numbers);
        int[] actual = {3,5,7};
        
        assertArrayEquals(expected, actual);
    }
}
