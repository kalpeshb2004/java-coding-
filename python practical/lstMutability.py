def lstitem(listI):
    listI.append(100)           # Modifies original list (mutable)
    print("list inside function ", listI)

lst = list(map(int, input("enter list item").split()))
lstitem(lst)
print("list otside funtion ", lst)  # List is modified outside too