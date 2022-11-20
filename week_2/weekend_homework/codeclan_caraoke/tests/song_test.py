import unittest
from classes.song import Song
from classes.room import Room
from classes.guest import Guest

class TestSong(unittest.TestCase):
    

     def setUp(self):

        self.room1 = Room("Heavy Metal", 10, 5)
        self.room2 = Room("Rock", 2, 30)
        self.room3 = Room("Pop", 20, 10)
        self.guest1 = Guest("Mick", 100)
        self.guest2 = Guest("Jack", 100)
        self.guest3 = Guest("Bryan", 100)
        self.song1 = Song("The Evil That Men Do")
        self.song2 = Song("Everlong")
        self.song3 = Song("Party in the USA")

def test_song_has_title(self):
    self.assertEqual("Californication", self.song.title)
    
    