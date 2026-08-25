def check_parking_status(parking_slots):
    return parking_slots


def park_a_car(parking_slots):
    slot = 0
    for index in range(len(parking_slots)):
        if parking_slots[index] == 0:
            parking_slots[index] = 1
            slot = index + 1
            break
    return slot
    
def is_available(parking_slots, slot):
    if parking_slots[slot - 1] == 0:
        return True
    return False

def park_a_car_with_slot(parking_slots, slot):
    if is_available(parking_slots, slot):
        if parking_slots[slot - 1] == 0:
            parking_slots[slot - 1] = 1

def remove_a_car(parking_slots, slot):
    if parking_slots[slot - 1] == 1:
        parking_slots[slot - 1] = 0


def display_the_slots(parking_slots):
    for index in range(len(parking_slots)):
        slot = index + 1
        if parking_slots[index] == 0:
            print(f"Available slot: {slot}")
        else:
            print(f"Occupied slot: {slot}")


def display_available_slot(parking_slots):
    for index in range(len(parking_slots)):
        slot = index + 1
        if parking_slots[index] == 0:
            print(f"Available slot: {slot}")


def display_occupied_slots(parking_slots):
    for index in range(len(parking_slots)):
        slot = index + 1
        if parking_slots[index] == 1:
            print(f"Occupied slot: {slot}")

