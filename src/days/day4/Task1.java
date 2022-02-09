package days.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int i;
        int chet = 0;
        int nochet = 0;
        int count1 = 0;
        int count8 = 0;
        int sum = 0;

        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] A = new int[n];

        for (i = 0; i < n; i++){
            A[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(A));

        for (i = 0; i < n; i++){
            if (A[i] > 8) count8++;
            if (A[i] == 1) count1++;
            if (A[i] % 2 == 0) chet++;
            if (A[i] % 2 != 0) nochet++;
            sum = sum + A[i];
        }

        System.out.println("Lenght array = " + A.length);
        System.out.println("> 8 = " + count8);
        System.out.println("= 1 = " + count1);
        System.out.println("Chet = " + chet);
        System.out.println("Nochet = " + nochet);
        System.out.println("Sum = " + sum);

    }
}
