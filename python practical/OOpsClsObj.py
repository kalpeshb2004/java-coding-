
class data:
    def __init__(self, name, age, city):    # Constructor
        self.name = name
        self.age = age
        self.city = city

    def show(self):                         # Method to display data
        print("name :", name)
        print("age :", age)
        print("city :", city)

name = input("enter name :")
age = int(input("enter age :"))
city = input("enter city :")

n1 = data(name, age, city)     # Create object
n1.show()                      # Call method
