# Take space-separated integers as input and convert to tuple
tpl = tuple(map(int, input("enter list of tuple item : ").split()))
print(tpl)

# Count how many times first element occurs
print("counting of num how many times occured :", tpl.count(tpl[0]))
# Find index of element at position 2
print("give index :", tpl.index(tpl[2]))
# Slice first 2 elements
print("parts of tuple", (tpl[:2]))