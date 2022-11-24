from models.pizza import Pizza

pizza1 = Pizza(8.00, 'Margarita', False, "L")
pizza2 = Pizza(10.00, 'Diavolo', False, "XL")
pizza3 = Pizza(7.00, 'Rustica', False, "M")

pizzas = [pizza1, pizza2, pizza3]

def get_order(order_index):
    return pizzas[order_index]

def add_order(order):
    pizzas.append(order)