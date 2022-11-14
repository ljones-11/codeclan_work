

class Team:

    def __init__(self, input_name, input_players, input_coach):

        self.name = input_name
        self.players = input_players
        self.coach = input_coach
        self.points = 0

    def add_player(self, new_player):

        self.players.append(new_player)

    def has_player(self, name):
#  if player in self.players also works but only in python
        for player in self.players:
            if player == name:
                return True
        return False        

    def play_game(self, result):

        if result:
            self.points += 3
              
