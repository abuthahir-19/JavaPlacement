class animals {
    public void eat() {
        System.out.println ("milk");
    }
}

class tiger extends animals {
    public void eat () {
        super.eat(); // super (keyword) used to access the super class or parent class methods or variables
        System.out.println ("meat");
    }
}

// Method overriding : It is a language feature that allows a subclass to define a implementation of specific method which
// is already defined in its parent class or super class 
public class MethodOverloading {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.eat();
    }    
}