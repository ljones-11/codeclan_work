import unittest
from classes.room import *
from classes.guest import *
from classes.song import *

class TestRoom(unittest.TestCase):
    
    def setUp(self):
        self.room1 = Room("Heavy Metal", 10, 5)
        self.room2 = Room("Rock", 2, 30)
        self.room3 = Room("Pop", 20, 10)
        self.guest1 = Guest("Mick", 100, "The Evil That Men Do")
        self.guest2 = Guest("Jack", 100, "Highway to Hell")
        self.guest3 = Guest("Bryan", 100, "Welcome to Paradise")
        self.song1 = Song("B")
        self.song2 = Song("Everlong")
        self.song3 = Song("Party in the USA")
        

    def test_room_has_name(self):
        self.assertEqual("Heavy Metal", self.room1.name)

    def test_room_has_capacity(self):
        self.assertEqual(10, self.room1.capacity)  

    def test_add_guest_to_room(self):
        self.room2.add_guest_to_room(self.guest1)
        self.assertEqual(1, len(self.room2.number_of_guests))

    def test_remove_guest_from_room(self):
        self.room2.add_guest_to_room(self.guest1)
        self.room2.remove_guest(self.guest1)
        self.assertEqual(0, len(self.room2.number_of_guests))

    def test_add_song_to_room(self):
        self.room2.add_song_to_room(self.song1)
        self.assertEqual(1, len(self.room2.songs))
    
    def test_room_is_full(self):
        self.room2.add_guest_to_room(self.guest1)
        self.room2.add_guest_to_room(self.guest2)
        self.room2.add_guest_to_room(self.guest3)
        self.assertEqual(2, len(self.room2.number_of_guests))
    
    def test_room_has_entry_fee(self):
        self.assertEqual(10, self.room3.entry_fee)

    def test_add_to_tab(self):
        self.room2.add_fee_to_tab(self.room2.entry_fee)
        self.assertEqual(30, self.room2.tab)
    
    def test_can_fit_in_room(self):
        outcome = self.room2.can_guest_fit()
        self.assertEqual(True, outcome)

    def test_cannot_fit_in_room(self):
        self.room2.add_guest_to_room(self.guest1)
        self.room2.add_guest_to_room(self.guest2)
        self.assertEqual(False, self.room2.can_guest_fit())

    

  
        
    


