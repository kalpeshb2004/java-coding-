def binary_search(arr, key):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == key:
            return mid
        elif arr[mid] < key:
            low = mid + 1
        else:
            high = mid - 1

    return -1


# 🔹 Taking input from user
n = int(input("Enter number of elements: "))

arr = []
print("Enter elements:")
for i in range(n):
    arr.append(int(input()))

# Sort array (important for binary search)
arr.sort()

print("Sorted array:", arr)

key = int(input("Enter element to search: "))

# Call function
result = binary_search(arr, key)

# Output
if result != -1:
    print("Element found at index:", result)
else:
    print("Element not found")