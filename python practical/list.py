#todays new commit 
lst = list(map(int,input("enter elements : ").split()))

lst.append(50)
print("appended elements at last pos :" ,lst)

lst.sort()
print("sortes elements :" ,lst)

if len(lst) > 0:
    lst.remove(lst[2])
print("removed array :" ,lst)

lst.reverse()
print("reversed list :" ,lst)

lst.insert(1,50)
print("inserted array is given")
