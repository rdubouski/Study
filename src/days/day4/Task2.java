package days.day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] A = new int[100];
        int min = 10000;
        int max = 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++){
            A[i] = (int) (Math.random() * 10000);
        }

        for (int num:A){
            if (num > max) max = num;
            if (num < min) min = num;
            if (num % 10 == 0){
                count++;
                sum = sum + num;
            }
        }

        System.out.println(Arrays.toString(A));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("End 0 = " + count);
        System.out.println("Sum = " + sum);
    }
}
