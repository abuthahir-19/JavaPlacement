class emp_master {
    private int empno;
    private String empName;

    public void assign_value() {
        empno = 101;
        empName = "ram";
    }

    public int return_empno () {
        return empno;
    }

    public String return_empName () {
        return empName;
    }
}

// Data Hiding : It is achieved by declaring confidential fields as private 

public class DataHiding {
    public static void main(String[] args) {
        emp_master t = new emp_master();
        t.assign_value();
        System.out.println ("Employee No : " + t.return_empno());
        System.out.println ("Employee Name : " + t.return_empName());
    }
}
