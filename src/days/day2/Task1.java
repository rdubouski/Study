package days.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input floor");
        int x = scanner.nextInt();
        if (x >= 1 && x <= 4) System.out.println("Little house");
        if (x >= 5 && x <= 8) System.out.println("Middle house");
        if (x >= 9) System.out.println("High house");
        if (x <= 1) System.out.println("Error");
    }
}
