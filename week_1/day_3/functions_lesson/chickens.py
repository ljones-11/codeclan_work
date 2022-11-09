chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]

def find_chicken_by_name(chicken_list, chicken_name):

    for chicken in chicken_list:
        if chicken["name"] == chicken_name:
            return chicken

    return None       


chicken = find_chicken_by_name(chickens, "Margaret") # passes 2 arguments to the function
print(chicken)