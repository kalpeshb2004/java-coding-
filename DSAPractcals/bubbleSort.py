arr = [2,5,7,1,4]

n = len(arr)

for i in range(n):
    for j in range(0,n-i-1):
       if arr[j] > arr[j+1]:
           arr[j] , arr[j+1] = arr[j+1] , arr[j]
print("sorted arr :", arr)           
           
