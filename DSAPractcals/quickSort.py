def quick_sort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[0]
    left = []
    right = []


    for i in range(1,len(arr)):
        if arr[i] <= pivot:
            left.append(arr[i])
        else:
            right.append(arr[i])
    return quick_sort(left) + [pivot] + quick_sort(right)
    
arr = [2,4,1,3,5]

sorted_arr = quick_sort(arr)

print("sorted arr: " , sorted_arr)