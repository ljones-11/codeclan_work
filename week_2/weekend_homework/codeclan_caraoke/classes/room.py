class Room:
    def __init__(self, name, capacity, entry_fee):
        self.name = name
        self.capacity = capacity
        self.entry_fee = entry_fee
        self.number_of_guests = []
        self.songs = []
        self.tab = 0
        
    def can_guest_fit(self):
        if len(self.number_of_guests) < self.capacity:
            return True
        else:
            return False
    
    def add_guest_to_room(self, guest):
        if self.can_guest_fit():
            self.number_of_guests.append(guest)

    def remove_guest(self, guest):
        self.number_of_guests.remove(guest) 

    def add_song_to_room(self, song): 
        self.songs.append(song)

    def add_fee_to_tab(self, entry_fee):
        self.tab += entry_fee

    def is_favourite_song_in_playlist(self, favourite_song):
        
        for song in self.songs:
            if song.title == favourite_song:
                return f"Yasss, this is my favourite song! {favourite_song}"
            else:
                return "They don't have my favourite song :("

       
        

    

    
    

