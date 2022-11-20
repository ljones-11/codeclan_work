# from classes.guest import Guest

class Room:
    def __init__(self, name, capacity, entry_fee):
        self.name = name
        self.capacity = capacity
        self.entry_fee = entry_fee
        self.number_of_guests = []
        self.songs = []

    
    def add_guest_to_room(self, guest):
        if len(self.number_of_guests) < self.capacity:
            self.number_of_guests.append(guest)
        
    
    def remove_guest(self, guest):
        self.number_of_guests.remove(guest) 
        

    def add_song_to_room(self, song): 
        self.songs.append(song)

#    def is_favourite_song_in_playlist(self, favourite_song):
#         for song in self.songs:
#             if song == favourite_song:
#                 return ("Yasss, this is my favourite song!")
       
        

    

    
    

