package hom2.Name_Bit;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] array = {1, 51, 514, -3, -65, 2};
        System.out.print(" массив : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n  выбором ");
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int p = i + 1; p < array.length; p++) {
                if (array[p] < array[min]) {
                    min = p;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
            System.out.print(array[i] + " ");
        }


        System.out.print("\n шейкерная  ");
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }
            left++;
        } while (left <= right);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.print("\nПузырьковая сортировка : ");
        for (int i = 0; i < array.length; i++) {
            for (int p = array.length - 1; p > i; p--) {
                if (array[p - 1] > array[p]) {
                    int m = array[p - 1];
                    array[p - 1] = array[p];
                    array[p] = m;

                }
                System.out.print(array[i] + " ");

//
//                System.out.print("\n  с помощью включения  ");
//                for (int i = 0; i < array.length; i++) {
//                    int x = array[i];
//                    int p = i - 1;
//                    while (p >= 0 && x < array[p]) {
//                        array[p + 1] = array[p];
//                        p--;
//                    }
//                    array[p + 1] = x;
//                }
//                for (int i = 0; i < array.length; i++) {
//                    System.out.print(array[i] + " ");
//                }
            }
        }
    }
}

