from unittest import TestCase
from simple_parking_system import *
 
 
class TestSimpleParkingSystem(TestCase):
 
    def test_that_all_parking_slots_are_empty(self):
        parking_slots = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 
        expected = check_parking_status(parking_slots)
        actual = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 
        self.assertListEqual(expected, actual)
 
    def test_that_a_car_was_parked_and_the_parking_status_changes(self):
        parking_slots = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), parking_slots)
 
        park_a_car(parking_slots)
        actual = [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual)
 
    def test_that_some_cars_are_parked(self):
        parking_slots = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), parking_slots)
 
        park_a_car(parking_slots)
        actual_car_one = [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual_car_one)
 
        park_a_car(parking_slots)
        actual_car_two = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual_car_two)
 
        park_a_car(parking_slots)
        actual_car_three = [1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual_car_three)
 
        park_a_car(parking_slots)
        actual_car_four = [1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual_car_four)
 
        park_a_car(parking_slots)
        actual_car_five = [1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual_car_five)
 
        park_a_car(parking_slots)
        actual_car_six = [1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertListEqual(check_parking_status(parking_slots), actual_car_six)
 
    def test_is_available_false(self):
        slots = [1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertFalse(is_available(slots, 1))
 
    def test_is_available_true(self):
        slots = [1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.assertTrue(is_available(slots, 13))
 
    def test_that_a_car_leaves_its_slot(self):
        parking_slots = [1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0]
 
        remove_a_car(parking_slots, 13)
        actual = [1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0]
 
        self.assertListEqual(check_parking_status(parking_slots), actual)
