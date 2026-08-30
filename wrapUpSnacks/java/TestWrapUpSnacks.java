import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestWrapUpSnacks {
    @Test
    public void testThatTheFactorialOf5Is120() {
        int expected = WrapUpSnacks.factorialOf(5);
        assertEquals(expected, 120);
    }
    @Test
    public void testThatTheFactorialOf7Is5040() {
        int expected = WrapUpSnacks.factorialOf(7);
        assertEquals(expected, 5040);
    }
    @Test
    public void testThat6IsTheLargestCommonDivisorOf12And18(){
        int expected = WrapUpSnacks.greatestCommonDivisorOf(12,18);
        assertEquals(expected, 6);
    }
    @Test
    public void testThat4IsTheLargestCommonDivisorOf24And20(){
        int expected = WrapUpSnacks.greatestCommonDivisorOf(24,20);
        assertEquals(expected, 4);
    }
    @Test
    public void testThat24IsTheLowestCommonMultipleOf6And8(){
        int expected = WrapUpSnacks.lowestCommonMultipleOf(6,8);
        assertEquals(expected, 24);
    }
    @Test
    public void testThat60IsTheLowestCommonMultipleOf12And10(){
        int expected = WrapUpSnacks.lowestCommonMultipleOf(12,10);
        assertEquals(expected, 60);
    }
    @Test
    public void testThat6IsAPerfectNumber(){
        assertTrue(WrapUpSnacks.isPerfectNumber(6));
    }
    @Test
    public void testThat10IsNotAPerfectNumber(){
        assertFalse(WrapUpSnacks.isPerfectNumber(10));
    }
    @Test
    public void testThatNumberOfDigitsIn419Is3(){
        int expected = WrapUpSnacks.countNumberOfDigitsIn(419);
        assertEquals(expected, 3);
    }
    @Test
    public void testThat145IsAStrongNumber(){
        boolean expected = WrapUpSnacks.isStrongNumber(145);
        assertTrue(expected);
    }
    @Test
    public void testThat700IsNotAStrongNumber(){
        boolean expected = WrapUpSnacks.isStrongNumber(700);
        assertFalse(expected);
    }
    @Test
    public void testThat153IsAnArmstrongNumber(){
        assertTrue(WrapUpSnacks.isArmstrong(153));
    }
    @Test
    public void testThat545IsNotAnArmstrongNumber(){
        assertFalse(WrapUpSnacks.isArmstrong(545));
    }
    @Test
    public void testThat2000IsALeapYear(){
        assertTrue(WrapUpSnacks.isLeapYear(2000));
    }
    @Test
    public void testThat2015IsNotALeapYear(){
        assertFalse(WrapUpSnacks.isLeapYear(2015));
    }
}
