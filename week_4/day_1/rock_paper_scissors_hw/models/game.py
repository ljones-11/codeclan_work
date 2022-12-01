class Game:
    def __init__(self, player1_choice, player2_choice):
        self.player1_choice = player1_choice
        self.player2_choice = player2_choice

    def result_of_game(player_choices):
        if player1_choice is 'Rock' and player2_choice is 'Paper':
            return "Player 2 Wins"
        if player1_choice is 'Rock' and player2_choice is 'Scissors':
            return "Player 1 Wins"
        if player1_choice is 'Rock' and player2_choice is 'Rock':
            return "Draw, play again"
        