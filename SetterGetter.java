public class SetterGetter {
   private String name;
    private int age;
  public  void  setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }
  public void setAge(int age){
      this.age = age;
  }

    public int getAge() {
        return age;
    }
}

class EncapTest{
    public static void main(String[] args) {


    SetterGetter p1 = new SetterGetter();
    p1.setName("Nirob");
    p1.setAge(20);
  System.out.println(p1.getName());
  System.out.println(p1.getAge());



    }
}