public class Circle extends  Shape{

    Circle(double r){
       super(r,r);
    }
    void area(){
        double result =Math.PI*dim1*dim2;
        System.out.println("Circle area : "+result);
    }
}

 class  Test{
    public  static  void main(String[] args){
        Shape shape;
        shape =  new Rectangle(10,20);
        shape.area();

        shape =  new Triangle(10,20);
        shape.area();
        shape = new Circle(10);
        shape.area();
    }
}