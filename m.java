import java.util.Scanner;

// explains about basic classes and object and function calls return type and access specifiers

// class cal {
//     public int add (int x, int y) {
//         return x + y;
//     }
// }



// explains about inheritance in object oriented programming implementation using java programming language


class CSE {
    int year;
    int cgpa;
    String coordinatorName;
    String mentorName;
    int noOfArrear;

    public void addStudentInfo () {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the currentYear : ");
        year = sc.nextInt();
        System.out.println ("Enter the current CGPA :");
        cgpa = sc.nextInt();
        sc.nextLine();
        System.out.println ("Enter the class Coordinator Name : ");
        coordinatorName = sc.nextLine();
        System.out.println ("Enter the Mentor Name : ");
        mentorName = sc.nextLine();
        System.out.println ("Enter the No of Arrears : ");
        noOfArrear = sc.nextInt();
        sc.close();
    }

    public void changeMentorName (String name) {
        mentorName = name;
    }
}

class StudentMaster extends CSE {
    int adno;
    String name;
     
    public void details () {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the Name of the Student :");
        name = sc.nextLine();
        System.out.println ("Enter the Admission No : ");
        adno = sc.nextInt();
    }
    public void displayStudentInfo () {
        System.out.println ("Name : " + name);
        System.out.println ("Admission No : " + adno);
        System.out.println ("Current Persuing Year : " + year);
        System.out.println ("CGPA till current semester : " + cgpa);
        System.out.println ("Class Coordinator : " + coordinatorName);
        System.out.println ("Mentor Name : " + mentorName);
        System.out.println ("No of Arrears : " + noOfArrear);
    }
}



// multilevel inheritance 

// class A {
//     public A () {
//         System.out.println ("Class A");
//     }

//     public void one () {
//         System.out.println ("Method of Class A");
//     }
// }

// class B extends A {
//     public B() {
//         System.out.println ("Class B");
//     }
//     public void two () {
//         System.out.println ("Method of Class B");
//     }
// }

// class C extends B {
//     public C() {
//         System.out.println ("Class C");
//     }

//     public void three () {
//         System.out.println ("Method of C class");
//     }
// }




// Multiple Inheritance 

class A  {
    public void MethA () {
        System.out.println ("Method of class A");
    }

    public void sum (int a, int b) {
        System.out.println((a + b) * 2);
    }
}

class B extends A {
    public void MethB() {
        System.out.println ("Method of class B");
    }

    public void sum (int a, int b) {
        System.out.println (a + b);
    }
}

// class C extends A, B {
//     public C() {
//         System.out.println ("Object of class C is created !!");
//     }
// }

public class m {
    public static void main(String[] args) {

        // Driver code for the class cal

        // Scanner sc = new Scanner(System.in);
        // System.out.println ("Enter the values of x and y :");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // cal c1 = new cal();
        // System.out.println ("Total : " + c1.add(a, b));
        // sc.close();



        // Driver code for the class StudentMaster
        // Nomal Inheritane 

        // StudentMaster sm = new StudentMaster();
        // sm.details();
        // sm.addStudentInfo();

        // System.out.println ("Student Information : ");
        // sm.displayStudentInfo();



        // Multilevel Inheritance 

        // C obj = new C();
        // obj.one();;
        // obj.two();;
        // obj.three();

        // B obj = new B();
        // obj.sum (10, 20);


        // Access specifier

        
    }    
}