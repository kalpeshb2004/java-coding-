
def data(name, age, city):
    if age <= 20:
        result = "age is less than 20"
    else:
        result = "age is greater than 20"
    # Return formatted string using f-string
    return f"name : {name} , age : {age}, city : {city} -> {result}"

name = input("enter a name")
age = int(input("enter age"))
city = input("enter city")
print(data(name, age, city))