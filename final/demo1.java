package file;

import java.io.File;

public class demo1 {
    public static void main(String[] args){

     /* for folder //  File dir = new File("person"); // je file projet e se file e show korbe
       File dir = new File("C:\\Users\\nirob\\OneDrive\\Desktop\\person");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        dir.delete();
        if(dir.delete())
        {
            System.out.println(dir.getName()+ "folder has been deleted");
        }

      */
        File dir = new File("person");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File file1 = new File(path+"/Student.txt");
        File file2 = new File(path+"/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("file are created");


        }catch (Exception e){
            System.out.println(e);

        }

    }
}
