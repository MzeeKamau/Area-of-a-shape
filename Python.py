import math

def area_circle(radius):
    return math.pi * (radius ** 2)

def area_rectangle(length, width):
    return length * width

def area_triangle(base, height):
    return 0.5 * base * height

def main():
    print("Area Calculation")
    shape = input("Enter the shape (circle, rectangle, triangle): ").lower()

    if shape == "circle":
        radius = float(input("Enter the radius of the circle: "))
        area = area_circle(radius)
        print(f"The area of the circle is: {area}")
    elif shape == "rectangle":
        length = float(input("Enter the length of the rectangle: "))
        width = float(input("Enter the width of the rectangle: "))
        area = area_rectangle(length, width)
        print(f"The area of the rectangle is: {area}")
    elif shape == "triangle":
        base = float(input("Enter the base of the triangle: "))
        height = float(input("Enter the height of the triangle: "))
        area = area_triangle(base, height)
        print(f"The area of the triangle is: {area}")
    else:
        print("Invalid shape entered. Please enter circle, rectangle, or triangle.")

if __name__ == "__main__":
    main()
