# Take space-separated integers as input and convert to list
lst = list(map(int, input("enter a list item : ").split()))
print("list item : ", lst)

lst.append(50)                  # Add 50 at end of list
print("list item : ", lst)

if len(lst) > 0:                # Remove first element if list is not empty
    lst.remove(lst[0])
print("list item : ", lst)

lst.sort()                      # Sort the list in ascending order
print("list item : ", lst)