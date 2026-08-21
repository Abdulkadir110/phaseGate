import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestCommonPrefix{
    @Test
    public void testThatArrayHasSimilarPrefix(){
        //Given
        String[] words = {"flower", "flow", "flight"};
        String expected = LongestCommonPrefix.theCommonPrefix(words);
        String actual = "f1";
        
        assertEquals(expected, actual);
    }
    
}
