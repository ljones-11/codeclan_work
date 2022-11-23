basketball_team = {
    "Centre" : "Andre Drummond",
    "Power Forward": "Derrick Jones Jr.",
    "Small Forward": "Malcolm Hill",
    "Point Guard": "Lonzo Ball",
    "Shooting Guard": "Coby White"
}

#Get name by position
print(basketball_team["Point Guard"])

#print positions
print(basketball_team.keys())

#Replace player function

def make_a_substitution(position, new_player):
    basketball_team[position] = new_player
    print(basketball_team)

make_a_substitution("Shooting Guard", "Michael Jordan")
