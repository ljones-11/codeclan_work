odd_ages = [number for number in [5, 15, 64, 27, 84, 26] if number % 2 == 1]
print(odd_ages)



chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"]

chicken_names_long = [chicken for chicken in chicken_names if len(chicken) >10]
print(chicken_names_long)

found_h = [chicken for chicken in chicken_names if chicken[0] == 'H']
print (found_h)

words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]
lower_letters = [letter[0].lower() for letter in words]
print(lower_letters)