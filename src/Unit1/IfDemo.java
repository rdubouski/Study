package Unit1;

public class IfDemo {

    public static void main(String[] args) {

        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a < b");
        if (a == b) System.out.println("a == b");
        System.out.println();

        c = a - b;
        System.out.println("c = " + c);
        if (c >= 0) System.out.println("c >= 0");
        if (c < 0 ) System.out.println("c < 0");

        System.out.println();
        c = b - a;
        System.out.println("c = " + c);
        if (c >= 0) System.out.println("c >= 0");
        if (c < 0 ) System.out.println("c < 0");
    }

}
