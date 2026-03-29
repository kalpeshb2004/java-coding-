
d = {}                          # Create empty dictionary
n = int(input("enter how values ti input :"))

# Input n key-value pairs from user
for i in range(n):
    key = input("enter key: ")
    value = input("enter values")
    d[key] = value

print(d)
print("keys : ", d.keys())     # Print all keys
print("value : ", d.values())  # Print all values
d.update({"city": "jalgaon"})  # Add new key-value pair
print(d)