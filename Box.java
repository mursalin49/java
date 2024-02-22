public class Box {
    double height,width,length;
     Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    // Function to adjust box dimensions based on requirements
    void displayVol() {
         double vol = height * width * length;
         System.out.println("volume is : "+ vol);
    }
    }

    class BoxVolume{
        public static void main(String[] args) {
            Box box1 = new Box(10,10,10);
            Box box2 = new Box(20,30,40 );

            box1.displayVol();
            box2.displayVol();
        }
    }
