from flask import render_template, request
from models.event import Event
from models.events_list import events, add_event
from datetime import datetime

from app import app

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/events")
def list_events():
    return render_template("/events.html", events=events)

@app.route("/events/new")
def new_event():
    return render_template("new_event.html")

@app.route("/events", methods=["POST"])
def save_event():
    form_data = request.form
    event_date = form_data["event_date"]
    event_name = form_data["event_name"]
    event_crowd = form_data["event_crowd"]
    event_location = form_data["event_location"]
    event_description = form_data["event_description"]
    event_age_restriction = form_data["event_age_restriction"]

    new_event = Event(event_date, event_name, event_crowd, event_location, event_description, event_age_restriction)
    add_event(new_event)

    return render_template("/events.html", events=events)

