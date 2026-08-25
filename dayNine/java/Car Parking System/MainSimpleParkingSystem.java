import java.util.Scanner;
public class MainSimpleParkingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] parkingSlots = {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0};
        
       
        String menuBar = """
        [1] Check the parking lot status 
        [2] Park My Car
        [3] Drive Out From My Spot
        [4] Exit        
        """;
        
        System.out.println(menuBar);
        System.out.print("Enter your choice(1 - 3): ");
        int choice = input.nextInt();
        while(choice != 4){
            switch(choice){
            case 1 : {
                SimpleParkingSystem.displayTheSlots(parkingSlots);
            }
            break;
            case 2 : {
                System.out.print("Do you have a slot you wished to park in(Y/N): ");
                String choiceSlot = input.next().toUpperCase();
                if(choiceSlot.equals("Y")){
                    System.out.print("Enter the slot number: ");
                    int slot = input.nextInt();
                    
                    if(parkingSlots[slot - 1] == 0){
                        SimpleParkingSystem.parkACar(parkingSlots,slot);
                        System.out.println("Slot " + slot + " is now occupied by you!");
                        System.out.println();
                        SimpleParkingSystem.displayAvailableSlot(parkingSlots);
                    }
                    else {
                        System.out.println("Oga The spot is occupied");
                        SimpleParkingSystem.displayAvailableSlot(parkingSlots);
                    }
                    
                    
                }
                else if (choiceSlot.equals("N")) {
                    int slot = SimpleParkingSystem.parkACar(parkingSlots);
                    System.out.printf("Your car is parked at slot %d%n", slot);
                }
               
            }
            break;
            case 3 : {
                System.out.print("Which slot do you want to drive out from: ");
                int slotNumber = input.nextInt();
                
                SimpleParkingSystem.removeACar(parkingSlots, slotNumber);
                SimpleParkingSystem.displayOccupiedSlots(parkingSlots);
                
            }
            break;
            case 4 : {
                System.out.println("Thank you for using my parking System");
                break;
            }
            default : 
                System.out.println("Invalid inputs, try again");
          
        }
            System.out.println();
            System.out.println(menuBar);
            System.out.print("Enter your choice(1 - 3): ");
            choice = input.nextInt();
        }
        
    }
}
