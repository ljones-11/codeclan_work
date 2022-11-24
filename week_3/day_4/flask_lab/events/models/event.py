class Event:
    def __init__(self, date, name, crowd, location, description, age_restriction):
        self.date = date
        self.name = name
        self.num_of_guests = crowd
        self.location = location
        self.decription = description
        self.age_restriction = age_restriction