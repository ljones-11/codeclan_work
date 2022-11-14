# WRITE YOUR FUNCTIONS HERE

def get_pet_shop_name(pet_shop): 

    return pet_shop["name"]

def get_total_cash(pet_shop):

    return pet_shop["admin"]["total_cash"]


def add_or_remove_cash(pet_shop,cash):

    
    pet_shop["admin"]["total_cash"] += cash
    

# def add_or_remove_cash__remove(pet_shop, change):

#     pet_shop["admin"]["total_cash"] -= change


def get_pets_sold(pet_shop):

    return pet_shop["admin"]["pets_sold"]


def increase_pets_sold(pet_shop, sold):

    pet_shop["admin"]["pets_sold"] += sold


def get_stock_count(pet_shop):

    return len(pet_shop["pets"])


def get_pets_by_breed(pet_shop, breed):

    pet_breeds = []

    for pet in pet_shop["pets"]:
        if pet["breed"] == breed:
            pet_breeds.append(breed)

    return pet_breeds
             


def find_pet_by_name(pet_shop, name):

    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            return pet                        


def remove_pet_by_name(pet_shop, name):

    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            pet_shop["pets"].remove(pet) 
        

def add_pet_to_stock(pet_shop, new_pet):

    pet_shop["pets"].append(new_pet)


def get_customer_cash(customer):

    return customer["cash"]


def remove_customer_cash(customer, cost):

    customer["cash"] -= cost
    return customer["cash"]


def get_customer_pet_count(customer):
    
    return len(customer["pets"])


def add_pet_to_customer(customer, new_pet):

    customer["pets"].append(new_pet)


def customer_can_afford_pet(customer, new_pet):

        if customer["cash"] >= new_pet["price"]:
            return True
        else:
            return False



def sell_pet_to_customer(pet_shop, pet, customer):

# # # #if pet there and customer can afford sell pet
# # # # get customer pet count
# # # # increase pets sold
# # # # get customer cahs
# # # # total cash

# # # #if find pet by name = pet

    if pet and customer_can_afford_pet(customer, pet):

        
        increase_pets_sold(pet_shop, 1)
        remove_customer_cash(customer, pet["price"])
        add_pet_to_customer(customer, pet)
        add_or_remove_cash(pet_shop,pet["price"])
       
        

