class Other {
    // Private variable : We can access it only from inside of the class that it belongs to and if we try to 
    // access it from outside of the class then a compile time error will be raised

    // private int i = 0;
    // public void Method () {
    //     i = 20;
    //     System.out.println (i);
    // }



    // Public variable : We can access a variable from within the class, outside the class, within the package and 
    // outside the package as well.

    // public int i = 0;
    // public void Method () {
    //     i = 20;
    // }




    // Protected variable : We can access the protected variable from inside and outside of a package but only
    // through inheritance  
    protected int i;
    public void Method() {
        i = 20;
    }
}
public class Access {
    public static void main(String[] args) {
        Other obj = new Other();
        obj.Method();
        System.out.println (obj.i);
    }
}
