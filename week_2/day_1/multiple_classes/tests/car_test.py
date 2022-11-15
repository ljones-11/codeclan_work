import unittest
from src.modules.Car import *
from src.modules.Engine import *
from src.modules.Gearbox import *

class  CarTest(unittest.TestCase):


    def setUp(self):
        self.engine = Engine(1000)
        self.gearbox = GearBox(5)
        self.car = Car("red", "Ford", self.engine, self.gearbox)

    def test_car_has_colour(self):
        self.assertEqual("red", self.car.colour)

    def test_num_of_gears(self):
        self.assertEqual(5, self.gearbox.num_of_gears)

    # def test_did_engine_start(self):
    #     self.assertEqual(self.engine.ignite())
