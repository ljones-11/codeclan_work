from flask import render_template, request

from app import app
from models.player import Player
from models.game import Game, result_of_game

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/results", methods="POST")
def results():
    player1_choice = request.form["player1"]
    player2_choice = request.form["player2"]
    player_choices = Game(player1_choice, player2_choice)
    result_of_game(player_choices)
    return render_template("results.html")

#use player class??
# player class could hold rock paper and scissors with boolean values?