import unittest
from src.pub import Pub
from src.drink import Drink
from src.customer import Customer

class TestPub(unittest.TestCase):
    

    def setUp(self):
        self.pub = Pub("The Codesman", 1000.00)
        self.drink = Drink("Beer", 3.00)
        self.pub.add_drink(self.drink)
        self.customer = Customer("Jack", 200, 19)

    def test_pub_has_name(self):
        self.assertEqual("The Codesman", self.pub.name)

    def test_till_total(self):
        self.assertEqual(1000.00, self.pub.till)

    def test_increase_till(self):
        self.pub.increase_till(3.00)
        self.assertEqual(1003.00, self.pub.till)
    
    def test_has_drink(self):
        self.assertEqual(1, len(self.pub.drink))

    def test_add_drink(self):
        gin = Drink("Gin", 4.00)
        self.pub.add_drink(gin)
        self.assertEqual(2, len(self.pub.drink))

    def test_remove_cash(self):
        self.customer.remove_cash(self.drink.price)
        self.assertEqual(197, self.customer.wallet)

    def test_buy_a_drink(self):
        self.customer.remove_cash(self.drink.price)
        self.pub.increase_till(self.drink.price)
        self.assertEqual(197, self.customer.wallet)
        self.assertEqual(1003.00, self.pub.till)

    def test_check_age(self):
        self.customer.check_age(self.customer.age)
        self.assertEqual(True)
    

    

    

    # def test_till_transaction
