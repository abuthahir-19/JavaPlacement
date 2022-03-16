// Exception : An unexpected error will be raised during the runtime of the program is 
// called Exception. The compiler will catch the exception through the predefined classes

// Purpose : It will not terminate the program instead it will be used to resume the 
// program even after the exceptionn occurs.

public class ExceptionHandling {
    public static void main(String[] args) {
        // int a = 1;
        // int b = 0;
        // int c;
        // try {
        //     c = a / b;
        //     System.out.println (c);
        // }
        // catch (ArithmeticException e) {
        //     System.out.println ("Any number is not allowed to divide by zero.");
        // }
        // System.out.println ("Error cleared\nWelcome to the code world..");


        try {
            int[] x = new int[3];
            x[4] = 100;
            System.out.println (x[4]);
        }
        catch (Exception e) {
            System.out.println ("Exception name : " + e);
        }
        System.out.println ("Program terminated successfully !!");
    }
}