class X {
    int y;
    public X (int y) {
        this.y = y;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        X u = new X (10);
        System.out.println (u.y);
    }    
}