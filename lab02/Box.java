public class Box {
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Function to adjust box dimensions based on requirements
    public void adjustDimensions() {
        final double REQUIRED_LENGTH = 10.0;
        final double REQUIRED_WIDTH = 12.0;
        final double REQUIRED_HEIGHT = 8.0;

        // Adjust length
        if (length != REQUIRED_LENGTH) {
            length = Math.max(length + 1, REQUIRED_LENGTH);
        }

        // Adjust width
        if (width != REQUIRED_WIDTH) {
            width = Math.max(width + 1, REQUIRED_WIDTH);
        }

        // Adjust height
        if (height != REQUIRED_HEIGHT) {
            height = Math.max(height - 2, REQUIRED_HEIGHT);
        }
    }

    // Function to display box dimensions
    public void displayDimensions() {
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
    }

    public static void main(String[] args) {
        // Create a Box object with initial dimensions
        Box box = new Box(9.0, 12.0, 10.0);

        // Display initial dimensions
        System.out.println("Initial Box Dimensions:");
        box.displayDimensions();

        // Adjust dimensions based on requirements
        box.adjustDimensions();

        // Display adjusted dimensions
        System.out.println("\nAdjusted Box Dimensions:");
        box.displayDimensions();
    }
}
