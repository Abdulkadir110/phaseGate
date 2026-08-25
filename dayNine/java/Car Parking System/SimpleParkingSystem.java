public class SimpleParkingSystem {
    
    public static int[] checkParkingStatus(int[] parkingSlots) {
        return parkingSlots;
    }
    public static int parkACar(int[] parkingSlots) {
        int slot = 0;
        for(int index = 0; index < parkingSlots.length; index++){
            if(parkingSlots[index] == 0){
                parkingSlots[index] = 1;
                slot = index + 1;
                break;
            }
            
        }
        
        return slot;
    }
    public static void parkACar(int[] parkingSlots, int slot) {
         if(isAvailable(parkingSlots, slot)) {
         
            if(parkingSlots[slot - 1] == 0){
                parkingSlots[slot - 1] = 1;
            }
         }
    }
     public static boolean isAvailable(int[] parkingSlots, int slot) {
            if(parkingSlots[slot - 1] == 0){
                return true;
            }
        return false;
    }
    public static void removeACar(int[] parkingSlots, int slot){
        if(parkingSlots[slot - 1] == 1){
            parkingSlots[slot - 1] = 0;
        }
    }
    public static void displayTheSlots(int[] parkingSlots){
        for(int index = 0; index < parkingSlots.length; index++){
            int slot = index + 1;
            if(parkingSlots[index] == 0){
                System.out.println("Available slot: " + slot );
            }
            else{
               System.out.println("Occupied slot: " + slot); 
            }
        }
    }
    public static void displayAvailableSlot(int[] parkingSlots){
        for(int index = 0; index < parkingSlots.length; index++){
            int slot = index + 1;
            if(parkingSlots[index] == 0){
                System.out.println("Available slot: " + slot );
            }
        }
    }
    public static void displayOccupiedSlots(int[] parkingSlots){
        for(int index = 0; index < parkingSlots.length; index++){
            int slot = index + 1;
            if(parkingSlots[index] == 1){
               System.out.println("Occupied slot: " + slot); 
            }
        }
    }
}
