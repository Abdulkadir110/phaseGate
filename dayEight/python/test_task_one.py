

from unittest import TestCase;
from task_one import *

class taskOneTest(TestCase):
    def test_ThatTheNumberIsEven(self) :
        number = 8
        
        self.assertTrue(isEven(number))

    def test_ThatTheNumberIsOdd(self) :
        number = 8
        
        self.assertTrue(isOdd(number))

    def test_ThatTheNumberIsOdd(self) :
        numbers = [5,4,3,2,1]
        
        expected = [6,8,4,4,2]
        actual = AddOneToEveryOddAndMultiplyEveryEvenIn(numbers)
        self.assertListEqual(actual, expected)
