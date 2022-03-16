class Maths {
    public void add (int a, int b) {
        int c;
        c = a + b;
        System.out.println (c);
    }

    public void add (float a, float b) {
        float c;
        c = a + b;
        System.out.println (c);
    }

    public void add (float a, int b) {
        float c;
        c = a + b;
        System.out.println (c);
    }
}

// Polymorphism : it is concept by which we can perform a same action in a different
// way is called polymorphism .

public class Polymorphism {
    public static void main(String[] args) {
        // Maths obj = new Maths();
        // obj.add (10, 20);
        // obj.add (2.5f, 2.5f);
        // obj.add (2.5f, 10);

        // String tree = "pine";int count = 0;
        // if (tree.equals("pine")) {
        //     int height = 55;
        //     count += 1;
        // }
        // System.out.println (height);

    }
}
