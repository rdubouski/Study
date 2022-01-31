package days.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input a anb b");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Error");
        } else {
            for (int i = a; i < b; i++){
                if ((i % 5 == 0) && (i % 10 != 0)){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
