public class Method_Overloading {

    void add(int a , int b){
        System.out.println(a+b);

    }
    void add(double a, double b)
    {
        System.out.println(a+b);
    }

    void add( int a, int b, int c){
System.out.println(a+b+c);

    }
    void add(){
        System.out.println(" nothing to add");
    }

}


class Overload_Test{
    public static void main(String[] args) {
        Method_Overloading ob = new Method_Overloading();
        ob.add();
        ob.add(5,10);
        ob.add(6.5,5.4);
        ob.add(5,3,4);
    }
}