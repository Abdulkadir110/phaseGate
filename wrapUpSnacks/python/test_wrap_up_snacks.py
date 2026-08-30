from unittest import TestCase
from wrap_up_snacks import *


class test_wrap_up_snacks(TestCase):

    def test_that_the_factorial_of_5_is_120(self):
        expected = factorial_of(5)
        self.assertEqual(expected, 120)

    def test_that_the_factorial_of_7_is_5040(self):
        expected = factorial_of(7)
        self.assertEqual(expected, 5040)

    def test_that_6_is_the_greatest_common_divisor_of_12_and_18(self):
        expected = greatest_common_divisor_of(12, 18)
        self.assertEqual(expected, 6)

    def test_that_4_is_the_greatest_common_divisor_of_24_and_20(self):
        expected = greatest_common_divisor_of(24, 20)
        self.assertEqual(expected, 4)

    def test_that_24_is_the_lowest_common_multiple_of_6_and_8(self):
        expected = lowest_common_multiple_of(6, 8)
        self.assertEqual(expected, 24)

    def test_that_60_is_the_lowest_common_multiple_of_12_and_10(self):
        expected = lowest_common_multiple_of(12, 10)
        self.assertEqual(expected, 60)

    def test_that_6_is_a_perfect_number(self):
        self.assertTrue(is_perfect_number(6))

    def test_that_10_is_not_a_perfect_number(self):
        self.assertFalse(is_perfect_number(10))

    def test_that_number_of_digits_in_419_is_3(self):
        expected = count_number_of_digits_in(419)
        self.assertEqual(expected, 3)

    def test_that_145_is_a_strong_number(self):
        expected = is_strong(145)
        self.assertTrue(expected)

    def test_that_700_is_not_a_strong_number(self):
        expected = is_strong(700)
        self.assertFalse(expected)

    def test_that_153_is_an_armstrong_number(self):
        self.assertTrue(is_armstrong(153))

    def test_that_545_is_not_an_armstrong_number(self):
        self.assertFalse(is_armstrong(545))

    def test_that_2000_is_a_leap_year(self):
        self.assertTrue(is_leap_year(2000))

    def test_that_2015_is_not_a_leap_year(self):
        self.assertFalse(is_leap_year(2015))


