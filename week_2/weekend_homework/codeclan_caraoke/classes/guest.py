from classes.room import *

class Guest:
    def __init__(self, name, wallet, favourite_song):
        self.name = name
        self.wallet = wallet
        self.favourite_song = favourite_song

    def remove_cash(self, entry_fee):

        self.wallet -= entry_fee

    def sufficient_funds(self, entry_fee):
        if self.wallet > entry_fee:
            return True
        else:
            return False
    

    