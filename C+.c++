#include <iostream>
#include <cmath>

using namespace std;

double areaCircle(double radius) {
    return 22/7 * radius * radius;
}

double areaRectangle(double length, double width) {
    return length * width;
}

double areaTriangle(double base, double height) {
    return 0.5 * base * height;
}

int main() {
    cout << "Area Calculation" << endl;
    cout << "Enter the shape (circle, rectangle, triangle): ";
    string shape;
    cin >> shape;

    if (shape == "circle") {
        cout << "Enter the radius of the circle: ";
        double radius;
        cin >> radius;
        double circleArea = areaCircle(radius);
        cout << "The area of the circle is: " << circleArea << endl;
    } else if (shape == "rectangle") {
        cout << "Enter the length of the rectangle: ";
        double length;
        cin >> length;
        cout << "Enter the width of the rectangle: ";
        double width;
        cin >> width;
        double rectangleArea = areaRectangle(length, width);
        cout << "The area of the rectangle is: " << rectangleArea << endl;
    } else if (shape == "triangle") {
        cout << "Enter the base of the triangle: ";
        double base;
        cin >> base;
        cout << "Enter the height of the triangle: ";
        double height;
        cin >> height;
        double triangleArea = areaTriangle(base, height);
        cout << "The area of the triangle is: " << triangleArea << endl;
    } else {
        cout << "Invalid shape entered. Please enter circle, rectangle, or triangle." << endl;
    }

    return 0;
}
