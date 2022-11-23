rugby_team = ['Prop1', 'Hooker', 'Prop3', 'Lock4', 'Lock5', 'Openside Flanker', 'Blindside Flanker', 'Number 8', 'Scrum-Half', 'Stand-Off', 'Left Wing', 'Inside Centre', 'Outside Centre', 'Right Wing', 'Fullback' ]

#number of players
number_of_players = len(rugby_team)
print(number_of_players)

#print list of positions
print(rugby_team)

#yellow card
rugby_team.remove("Hooker")
print(rugby_team)

#print forwards
print(rugby_team[0:7])

def list_backs(team):
    print(team[8:14])

list_backs(rugby_team)













