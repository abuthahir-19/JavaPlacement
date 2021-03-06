// Interface : it is a user defined reference type which hold abstract methods only 
// and also code will looks in a readable form when it is structured using interface 
// an interface cannot be instantiated 


// Features : 
//      1.To achieve abstraction 
//      2.It will not accept access specifier
//      3.It supports multiple inheritance



// interface Employee {
//     void assign_value();
// }

// class employee_master implements Employee {
//     int empNo;
//     public void assign_value () {
//         empNo = 1001;
//         System.out.println (empNo);
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         employee_master obj = new employee_master();
//         Employee g = obj;
//         g.assign_value();
//     }        
// }

// interface jio {
//     void sim_card();
// }

// class airtel implements jio {
//     public void sim_card () {
//         System.out.println ("jio_sim 3 months free");
//     }
// }

// class vodafone implements jio {
//     public void sim_card() {
//         System.out.println ("jio sim one year free");
//     }
// }

abstract class nokia1_0 {
    public void sim_card() {
        System.out.println ("250mb");
    }
    abstract void camera();
}

class nokia3_5 extends nokia1_0 {
    public void sim_card() {
        super.sim_card();;
        // System.out.println ("2gb");
    }

    public void camera() {
        System.out.println ("5mp");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // airtel a = new airtel();
        // jio j = a;
        // j.sim_card();
        // vodafone v = new vodafone();
        // jio y = v;
        // y.sim_card();
        

        // jio t = new airtel();
        // t.sim_card();


        // nokia3_5 t = new nokia3_5();
        // t.sim_card();
        // t.camera();

        nokia1_0 obj = new nokia3_5();
        obj.sim_card();
    }
}