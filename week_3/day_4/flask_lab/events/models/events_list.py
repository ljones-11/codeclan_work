from models.event import Event

event1 = Event("01:01:23", "Biffy Clyro", 1700, "o2 Academy", "The Myth of the Happily Ever After Tour", False)
event2 = Event("03:02:23", "Scotland vs England", 67500, "Murrayfield", "Calcutta Cup rugby match", False)
event3 = Event("28:06:23", "Peter Kay", 5000, "SSE Hydro", "Peter Kay LIVE", True)

events = [event1, event2, event3]

def add_event(new_event):
    events.append(new_event)
