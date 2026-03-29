
a = int(input("enter number for global variable"))  # Global variable

def scop():
    a = int(input("enter number for local variable"))  # Local variable
    print("printing local variable", a)

scop()
print("printing global variable", a)   # Global 'a' is unchanged