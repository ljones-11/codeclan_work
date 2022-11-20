import unittest
from classes.guest import *
from classes.room import *
from classes.song import *

class TestGuest(unittest.TestCase):

    def setUp(self):
          self.room1 = Room("Heavy Metal", 10, 5)
          self.room2 = Room("Rock", 2, 30)
          self.room3 = Room("Pop", 20, 10)
          self.guest1 = Guest("Mick", 100, "The Evil That Men Do")
          self.guest2 = Guest("Jack", 100, "Highway to Hell")
          self.guest3 = Guest("Bryan", 100, "Party in the USA")
          self.song1 = Song("Thriller")
          self.song2 = Song("Everlong")
          self.song3 = Song("Party in the USA")

    def test_customer_has_cash(self):
        self.assertEqual(100,self.guest1.wallet)
    
    def test_remove_cash(self):
        self.guest1.remove_cash(self.room2.entry_fee)
        self.assertEqual(70, self.guest1.wallet)
    
    def test_customer_has_sufficient_funds(self):
        self.assertEqual(True, self.guest1.sufficient_funds(self.room3.entry_fee))

    def test_customer_has_not_sufficient_funds(self):
        self.guest4 = Guest("Austin", 3, "Head Rolls Off")
        self.assertEqual(False, self.guest4.sufficient_funds(self.room3.entry_fee))

    def test_guest_has_a_favourite_song(self):
        self.assertEqual("Party in the USA", self.guest3.favourite_song)

    # def test_no_favourite_song(self):
    #     self.room2.add_guest_to_room(self.guest3)
    #     self.room2.add_song_to_room(self.song3)
    #     self.room2.add_song_to_room(self.song1)
    #     self.room2.add_song_to_room(self.song2)
    #     outcome = self.guest3.is_favourite_song_in_playlist(self.room2.songs)
    #     self.assertEqual("They don't have my favourite song :(", outcome)



    def test_favourite_song_in_playlist(self):
        self.room1.add_guest_to_room(self.guest1)
        self.room1.add_song_to_room(self.song1)
        outcome = self.guest1.is_favourite_song_in_playlist(self.room1.songs)
        self.assertEqual("Yasss, this is my favourite song!", outcome)
    
   



