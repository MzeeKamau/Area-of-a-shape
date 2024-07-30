import java.util.Scanner;

public class AreaCalculator {

    public static double areaCircle(double radius) {
        return Math.PI * (radius * radius);
    }

    public static double areaRectangle(double length, double width) {
        return length * width;
    }

    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area Calculation");
        System.out.print("Enter the shape (circle, rectangle, triangle): ");
        String shape = scanner.nextLine().toLowerCase();

        switch (shape) {
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = areaCircle(radius);
                System.out.println("The area of the circle is: " + circleArea);
                break;
            case "rectangle":
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = areaRectangle(length, width);
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;
            case "triangle":
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = areaTriangle(base, height);
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
            default:
                System.out.println("Invalid shape entered. Please enter circle, rectangle, or triangle.");
                break;
        }

        scanner.close();
    }
}
