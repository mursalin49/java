package Type_casting;

public class Test {
    public  static  void  main(String[] args){
       /* double y = 10.5;
        int x = (int) y;
        System.out.println(y);
        /primitive
        */
        Person p = new Teacher();
        p.display();
        Teacher t = (Teacher) new Person();
        t.display();
    }
}
