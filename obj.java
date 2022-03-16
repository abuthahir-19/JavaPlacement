class first {
    int empno;
    String empname, empAddress;
}

class Maths {
    int a, b, c;
    // non-parameterized constructor
    public Maths() {
        a = 0;
        b = 0;
        c = 0;
    }


    // parameterized constructor
    public Maths (int f, int s, int t) {
        a = f;
        b = s;
        c = t;
    }
}

public class obj {
    int empNo;
    String empname, address;

    public static void main(String[] args) {
        // first f = new first();
        // f.empno = 30;
        // f.empname = "raja";
        // f.empAddress = "Gandhi Nagar";
        // System.out.println ("Employee No : " + f.empno);
        // System.out.println ("Employee Name : " + f.empname);
        // System.out.println ("Employee Address : " + f.empAddress);

        // This code is used to describe about the default constructor

        // Maths m = new Maths();
        // System.out.println (m.a);
        // System.out.println (m.b);
        // System.out.println (m.c);


        // This code is used to describe about the non-parameterized constructor
        Maths m = new Maths();
        System.out.println (m.a);
        System.out.println (m.b);
        System.out.println (m.c);


    }
}
/**
reference variable vs pointer variable
object -> It is a reference type variable it holds the address of intermediate memory
location where the address of actual data is being stored


**/