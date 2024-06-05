import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public  static  void  main(String[] args) {
       try{
        File file  =  new File("H:\\java_mid\\java_final\\person\\student.txt");
           Scanner scanner = new Scanner(file);

           while(scanner.hasNext()) {
String id = scanner.next();
String name =  scanner.next();
System.out.println("ID: "+id + " name:"+name);
           }
           scanner.close();
    }catch (Exception e){
           System.out.println(e);
       }
    }
}
