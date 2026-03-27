def add_poly(p1, p2):
    return [p1[i] + p2[i] for i in range(len(p1))]

def sub_poly(p1, p2):
    return [p1[i] - p2[i] for i in range(len(p1))]

# Function to convert list → polynomial string
def display_poly(poly):
    n = len(poly)
    result = ""

    for i in range(n):
        coef = poly[i]
        power = n - i - 1

        if coef == 0:
            continue

        # Sign handling
        if coef > 0 and result != "":
            result += " + "
        elif coef < 0:
            result += " - "
            coef = abs(coef)

        # Term formatting
        if power == 0:
            result += str(coef)
        elif power == 1:
            result += f"{coef}x"
        else:
            result += f"{coef}x^{power}"

    return result if result else "0"


# 🔹 User Input
n = int(input("Enter degree of polynomial: "))

print("Enter coefficients of first polynomial:")
p1 = [int(input(f"Coefficient of x^{n-i}: ")) for i in range(n+1)]

print("Enter coefficients of second polynomial:")
p2 = [int(input(f"Coefficient of x^{n-i}: ")) for i in range(n+1)]

# 🔹 Operations
sum_poly = add_poly(p1, p2)
sub_poly_res = sub_poly(p1, p2)

# 🔹 Output
print("Addition Result:", display_poly(sum_poly))
print("Subtraction Result:", display_poly(sub_poly_res))