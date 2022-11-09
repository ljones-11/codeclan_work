users = [
  { "user_id": 1, "first_name": "Guido", "last_name": "van Rossum" },
  { "user_id": 2, "first_name": "Katherine", "last_name": "Johnson" },
  { "user_id": 3, "first_name": "Dorothy", "last_name": "Vaughan" },
  { "user_id": 4, "first_name": "Hen", "last_name": "Solo" },
  { "user_id": 5, "first_name": "Mary", "last_name": "Jackson" },
]

#write a function that can find a user in the list by user_id

def find_user_by_id(user_list, user_name):

    for user in user_list:
        if user["user_id"] == user_name:
            return user

    return None       

id = input("Please enter a user ID> ")
id = int(id)
user = find_user_by_id(users, id) # passes 2 arguments to the function
print(user)