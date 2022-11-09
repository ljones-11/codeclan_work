stops = [ "Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket" ]

#1. Add "Edinburgh Waverley" to the end of the list

stops.append("Edinburgh")

#2. Add "Glasgow Queen St" to the start of the list

stops.insert(0, "Glasgow Queen St")

#3. Add "Polmont" at the appropriate point (between "Falkirk High" and "Linlithgow")

stops.insert(3, "Polmont")

#4. Print out the index position of "Linlithgow"

print(stops.index("Linlithgow"))

#5. Remove "Livingston" from the list using its name

stops.remove("Livingston")

#6. Delete "Cumbernauld" from the list by index

stops.pop(2)

#7. Print the number of stops there are in the list

number_stops = len(stops)
print(number_stops)

#8. Sort the list alphabetically

sorted_list = sorted(stops) #sort would keep orgiginal list

#9. Reverse the positions of the stops in the list

reverse_list = sorted(stops, reverse=True)

#10 Print out all the stops using a for loop

for stop in stops:
    print(stop)