from simple_parking_system import *
 
parking_slots = [0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 
menu_bar = """
[1] Check the parking lot status
[2] Park My Car
[3] Drive Out From My Spot
[4] Exit
"""
 
print(menu_bar)
choice = int(input("Enter your choice(1 - 3): "))
while choice <= 4:
    match choice:
        case 1:
            display_the_slots(parking_slots)
        case 2:
            choice_slot = input("Do you have a slot you wished to park in(Y/N): ").upper()
            match choice_slot:
                case "Y":
                    slot = int(input("Enter the slot number: "))
                    if parking_slots[slot - 1] == 0:
                        park_a_car_with_slot(parking_slots, slot)
                        print(f"Slot {slot} is now occupied by you!")
                        print()
                        display_available_slot(parking_slots)
                    else:
                        print("Oga The spot is occupied")
                        display_available_slot(parking_slots)
                case "N":
                    slot = park_a_car_auto(parking_slots)
                    print(f"Your car is parked at slot {slot}")
        case 3:
            slot_number = int(input("Which slot do you want to drive out from: "))
            remove_a_car(parking_slots, slot_number)
            display_occupied_slots(parking_slots)
        case 4:
            print("Thank you for using my parking System")
            break
        case _:
            print("Invalid inputs, try again")
    print()
    print(menu_bar)
    choice = int(input("Enter your choice(1 - 3): "))

