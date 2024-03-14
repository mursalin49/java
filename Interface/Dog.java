
    public  class Dog implements Animal{
        public  void eat(){
            System.out.println("Dogs can egg");
        }
    }
class  N{
    public  static  void  main(String[] args){
        Dog d = new Dog();
        d.eat();
    }
}