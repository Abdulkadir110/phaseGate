

from unittest import TestCase;
from string_of_brackets import *

class StringOfBracketTest(TestCase):
    def test_thatAllBracketsAreClosed(self) :
        characters = "{}<>()"
        
        self.assertTrue(allBracketAreClosed(characters))

    def test_ThatAllBracketsAreNotClosed(self) :
        characters = "][()<>{"
        
        self.assertFalse(allBracketAreClosed(characters))
        
    def test_ThatTheNumberIsOdd(self) :
        characters = "((()))["
        
        self.assertFalse(allBracketAreClosed(characters))
