// class a {
//     public void first () {
//         System.out.println ("first");
//     }

//     public void second () {
//         System.out.println ("Second");
//         this.first();
//     } 
// }

class a {
    public a () {
        this (10); // this can be used as a parameterized constructor 
    }

    public a (int f) {
        System.out.println (f);
    }

    public final void close() {
        System.exit(1);
    }
}

public class Main {
    public static void main(String[] args) {
        a obj = new a();
        obj.close();
    }
}