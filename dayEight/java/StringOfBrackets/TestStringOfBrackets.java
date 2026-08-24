import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStringOfBrackets {
    @Test
    public void testThatAllBracketsInTheGivenStringsAreClosed(){
    //Given
    String characters = "[]{}()";
    
    assertTrue(StringOfBracket.allBracketAreClosed(characters));
    }
    @Test
    public void testThatAllBracketsInTheGivenStringsAreNotClosed(){
    //Given
    String characters = "[{](";
    
    assertFalse(StringOfBracket.allBracketAreClosed(characters));
    }
    @Test
    public void testThatAllBracketsInTheGivenStringsAreNotCompleted(){
    //Given
    String characters = "[{)](}";
    
    assertTrue(StringOfBracket.allBracketAreClosed(characters));
    }
}
