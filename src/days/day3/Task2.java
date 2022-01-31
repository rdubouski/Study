package days.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a, b;
        while (true){
            System.out.print("Input a and b: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0) return;
            System.out.println("a / b = " + a / b);
        }
    }
}
