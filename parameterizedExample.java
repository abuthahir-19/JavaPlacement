class Emp {
    int empno;
    String name;
    public Emp (int empNo, String empName) {
        empno = empNo;
        name = empName;
    }
}

public class parameterizedExample {
    public static void main(String[] args) {
        Emp t = new Emp(10, "Karthick");
        System.out.println ("Employee name : " + t.empno + " " + "Employee Name : " + t.name);        
    }
}