// import java.util.*;

public class First {
    //function having no argument and no return type
    // public static void sum () {
    //     int a = 2;
    //     int b = 3;
    //     System.out.println (a + b);
    // }

    //function having argument and no return type
    // public static void sum (int a, int b) {
    //     System.out.println (a + b);
    // }

    //function having no argument and return type 
    public static int sum () {
        int a= 30;
        int b = 39;
        return a + b;
    }

    //function having argument and return type
    public static int sum (int a, int b) {
        return a + b;
    }
    public static void main(String[] var) {
        for (int i = 0; i < var.length; i++) {
            System.out.println (var[i]);
        }
    }    
}
