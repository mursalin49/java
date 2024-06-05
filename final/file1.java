package String;

import java.util.Scanner;

public class file1 {
    public  static  void main(String[] args){
        String s1 =  "Nirob";
        String s2 =  new String("mur");

        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        int len = s1.length();
        System.out.println("length of s1="+len);
        if(s1.contains(s2)){
            System.out.println("Equals");

        }
        else{
            System.out.println("not Equals");
        }
boolean con = s1.contains("Nirob");
        System.out.println(con);

     //   boolean b = s1.isEmpty();
     //   System.out.println("b= "+b);

        String firstName = "Nirob";
        String lastName = "Hasan";
        String fullName = firstName+lastName;
        System.out.println("FullName: "+fullName);

        String upperName = fullName.toUpperCase();
        System.out.println("UpperCase :"+upperName);

        boolean b = firstName.startsWith("a");
        System.out.println("b:"+b);

    }
}
