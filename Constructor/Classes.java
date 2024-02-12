
public class Classes {
    String name, gender;
  int phone ;
    Classes(){  // for defult constructor
      System.out.println("No Value");
  }
  Classes(String m, String n, int p ){   // for parameter constructor
name = m;
gender= n;
phone = p;
  }
  void displayInformation(){
      System.out.println("Name:" + name);
      System.out.println("Gender:" + gender);
      System.out.println("Phone:" + phone);
      System.out.println("\n\n");
  }
}

