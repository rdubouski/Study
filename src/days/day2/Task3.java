package days.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input a anb b");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Error");
        } else {
            while (a < b){
                if ((a % 5 == 0) && (a % 10 != 0)){
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}
