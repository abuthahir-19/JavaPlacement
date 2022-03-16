import java.util.*;

class Student {
    String name, fatherName, motherName;
    String dob;
    String college;
    String collegeID;
    String gender;
    String debt;
    int year;
    float cgpa;

    public void setBasicDetails () {
        Scanner inp = new Scanner(System.in);
        System.out.println ("Enter the Name : ");
        name = inp.nextLine();
        System.out.println ("Enter Father name : ");
        fatherName = inp.nextLine();
        System.out.println ("Enter Mother name : ");
        motherName = inp.nextLine();
        System.out.println ("Enter the date of birth(dd-mm-yy) : ");
        dob = inp.nextLine();
        System.out.println ("Enter college name : ");
        college = inp.nextLine();
        System.out.println ("Enter college ID : ");
        collegeID = inp.nextLine();
        System.out.println ("Enter gender : ");
        gender = inp.next();
        System.out.println ("Enter the name of the department : ");
        debt = inp.nextLine();
        inp.nextLine();
        System.out.println ("Enter the currently persuing year : ");
        year = inp.nextInt();
        System.out.println ("Enter the CGPA till current semester(precesion upto 2 decimal places) : ");
        cgpa = inp.nextFloat();
    }

    public void displayDetails() {
        System.out.println ("Name : " + name);
        System.out.println ("Father Name : " + fatherName);
        System.out.println ("Mother Name : " + motherName);
        System.out.println ("Date of Birth (dd-mm-yy) : " + dob);
        System.out.println ("College Name : " + college);
        System.out.println ("College ID : " + collegeID);
        System.out.println ("Gender : " + gender);
        System.out.println ("Department : " + debt);
        System.out.println ("Year : " + year);
        System.out.println ("CGPA : " + cgpa);
        System.out.println ("Confirm the above information to proceed further....");
    } 
}
public class Inheritance {
    public static void main(String[] args) {
        
    }
}
