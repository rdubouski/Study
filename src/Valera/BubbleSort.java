package Valera;

import java.util.Arrays;

public class BubbleSort {

    private static void swap(int Arr[]){
        int tmp;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 1; j < Arr.length; j++) {
                if (Arr[j] < Arr[j - 1]) {
                    tmp = Arr[j];
                    Arr[j] = Arr[j - 1];
                    Arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int Arr[] = {3, 2, 4, 1, 5, 9, 7, 6, 8};
        System.out.println("No sort array");
        System.out.println(Arrays.toString(Arr));

        System.out.println("Sort array");
        swap(Arr);
        System.out.println(Arrays.toString(Arr));

    }
}
