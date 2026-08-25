import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestSimpleParkingSystem {
    @Test
    public void testThatAllParkingSlotsAreEmpty(){
        
        int[] parkingSlots = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        int[] expected = SimpleParkingSystem.checkParkingStatus(parkingSlots);
        int[] actual = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testThatACarWasParkedAndTheParkingStatusChanges(){
      
        int[] parkingSlots = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), parkingSlots);
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actual = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actual);
        
    }
    @Test
    public void testThatSomeCarsAreParked(){
      
        int[] parkingSlots = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), parkingSlots);
        
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actualCarOne = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actualCarOne);
        
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actualCarTwo = {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actualCarTwo);
        
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actualCarThree = {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actualCarThree);
        
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actualCarFour = {1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actualCarFour);
        
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actualCarFive = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actualCarFive);
        
        SimpleParkingSystem.parkACar(parkingSlots);
        int[] actualCarSix = {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actualCarSix);
        
        
    }
    @Test
    public void testIsAvailableFalse() {
        int[] slots = {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertFalse(SimpleParkingSystem.isAvailable(slots, 1));
    }
    public void testIsAvailableTrue() {
        int[] slots = {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertTrue(SimpleParkingSystem.isAvailable(slots, 13));
    }
    @Test
    public void thatThatACarLeavesItsSlot(){
       int[] parkingSlots = {1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,1,1,0,0,0};
       
       SimpleParkingSystem.removeACar(parkingSlots, 13);
       int[] actual = {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0};
       
       assertArrayEquals(SimpleParkingSystem.checkParkingStatus(parkingSlots), actual);
    }
}
