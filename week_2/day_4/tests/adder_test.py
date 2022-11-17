from unittest import TestCase
from modules.adder import add_one

class AdderTest(TestCase):
    def test_add_one_to_5_is_6(self):
        expected_value = 6
        input_value = 5
        self.assertEqual(expected_value, add_one(input_value))

    def test_add_one_to_10_is_11(self):
        expected_value = 11
        input_value = 10
        self.assertEqual(expected_value, add_one(input_value))