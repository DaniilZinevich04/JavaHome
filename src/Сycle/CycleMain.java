package Сycle;

import java.util.Scanner;

public class CycleMain {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        {

        System.out.println(" Таблица умножения ");
        System.out.print("по вертикали - ");
        int n = r.nextInt();
        System.out.print("по горизонтали - ");
        int l = r.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k < l + 1; k++) {
                System.out.printf("%5d", (k * i));
            }
            System.out.println("");
        }

     int a = r.nextInt();//Переможение 1*2*3
        int f = 1;
        for (int i = 1; a > 0; a--) {
            f = f * a;
        }
        System.out.println(f);


            System.out.print("Введите 5-ти значное число \n через нажатие клавиши enter после каждой цифры ");
        int q = r.nextInt();// попытка на перемножения 9210 - 9*2*1*0
        int  b = r.nextInt();
        int p = r.nextInt();
        int c = r.nextInt();
        int d = r.nextInt();
        for (int i = 0; q*b*i < a*b  ;i++ ) {

            System.out.println(a*b*c*d*p);
        }


        }
    }
}