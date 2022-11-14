from modules.Car import *
from modules.Engine import *
from modules.Gearbox import *

engine = Engine(2)
gearbox = GearBox(6)

car = Car("red", "Ford", engine, gearbox)

print(car.colour)
print(car.engine.volume)
print(car.engine.ignite())
print(car.gearbox.engage())