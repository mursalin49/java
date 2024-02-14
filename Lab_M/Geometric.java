package lab_mid;
    interface GeometricObject {
        double getArea();
        double getPerimeter();
    }

    // Circle class implementing GeometricObject interface
    class Circle implements GeometricObject {
      double radius;

         Circle(double radius) {
            this.radius = radius;
        }

        @Override
       public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }


    class Rectangle implements GeometricObject {
 double width;
 double height;

        public Rectangle(double width, double height) {
            this.width = width;
              this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }





