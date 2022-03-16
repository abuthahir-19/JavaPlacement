class X {
    int t;
    public X (int y) {
        t = y;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        X u = new X (10);
        System.out.println (u.t);
    }    
}
