

from unittest import TestCase;
from add_elements_in_lists_of_lists import *

class ArraysOfArraysTest(TestCase):
    def test_All_elementsAreAdded(self) :
        numbers = [[3,5,7], [2,2,2], [4,1,9]]
        
        expected = [15,6,14]
        actual = addElementsInEachListOf(numbers)
        self.assertListEqual(actual, expected)

