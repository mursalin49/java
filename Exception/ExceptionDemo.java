package Exception_Handling;

import java.lang.reflect.Array;

public class ExceptionDemo {
    public static void main(String[] args){
        try{
            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("Result :"+result);
        } catch (ArrayIndexOutOfBoundsException e ){ // ekane exception kaj korbe na
            System.out.println("Exception :"+e);

        }
        catch (Exception e ){ // exception kaj korbe
            System.out.println("Exception :"+e);

        }
finally {    //uporer error dekalew ei line print korbe
            System.out.println("Last line of the program");
        }


    }
}
