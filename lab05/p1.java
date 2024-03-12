
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// Implement the MovablePoint class
class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    // Parameterized constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Implement the Movable methods
    public void moveUp() {
        y -= ySpeed;
    }

    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    // Display information about the point
    public void displayInfo() {
        System.out.println("Point Position: (" + x + ", " + y + ") Speed: (" + xSpeed + ", " + ySpeed + ")");
    }
}

// Implement the MovableCircle class
 class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    // Parameterized constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Implement the Movable methods using the center point
    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    // Display information about the circle
    public void displayInfo() {
        System.out.println("Circle Center: (" + center.x + ", " + center.y + "), Radius: " + radius +
                ", Speed: (" + center.xSpeed + ", " + center.ySpeed + ")");
    }
}

// Example usage
 class Main {
public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        point.moveRight();
        point.moveUp();
        point.displayInfo();

        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
        circle.moveLeft();
        circle.moveDown();
        circle.displayInfo();
    }
}
