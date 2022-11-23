from app import app
from flask import render_template
from models.order_list import orders

@app.route('/orders')
def list_orders():
    return render_template('order_list.html', orders=orders)

@app.route('/orders/<int:id_no>')
def single_order(id_no):
    chosen_order = orders[id_no]
    return render_template('order.html', order=chosen_order)