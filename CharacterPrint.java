import java.util.*;

public class CharacterPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamil, eng, math, sci, soc, total;

        System.out.println ("Enter the name of the Student :");
        String name = sc.nextLine();
        System.out.println ("Enter the mark details of the student :");
        System.out.println ("Enter the marks secured in tamil : ");
        tamil = sc.nextInt();
        System.out.println ("Enter the marks secured in english : ");
        eng = sc.nextInt();
        System.out.println ("Enter the marks secured in Maths : ");
        math = sc.nextInt();
        System.out.println ("Enter the marks secured in Science : ");
        sci = sc.nextInt();
        System.out.println ("Enter the marks secured in Social : ");
        soc = sc.nextInt();
        total = tamil + eng + math + sci + soc;
        System.out.println ("Total marks secured by the student : " + total);
        if (total > 430) {
            System.out.printf ("%s are belongs to first group", name);
        }
        else {
            System.out.printf ("%s are belongs to second group", name);
        }
        sc.close();
    }
}
