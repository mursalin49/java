package lab_mid;

public class Geo {

        public static void main(String[] args) {
            GeometricObject circle = new Circle(5.0);
            GeometricObject rectangle = new Rectangle(4.0, 6.0);

            System.out.println("Circle:");
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());

            System.out.println("\nRectangle:");
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
        }
    }

