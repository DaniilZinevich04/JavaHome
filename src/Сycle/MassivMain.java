package Сycle;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class MassivMain {


    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int a = 1; //A.nextInt();
        int b = 2;//A.nextInt();
        int c = 3;//A.nextInt();
        int d = 4;//A.nextInt();
        int[] Massiv = {a, b, c, d};


        //  2.1

        int i = -1;
        while (i < 10) {
            i++;
            System.out.println(Massiv[i]);

        }




        do{
            i++;
            System.out.println(Massiv[i]);
        }while(i < 10);


    for (int i = 0; i <= 10; i++) {
            System.out.println(Massiv[i]);
        }


        for (int q : Massiv)
        {
            i++;
            System.out.println(Massiv[i]);
        }



        //2.2

        while (i < 10) {
            i=i+2;
            System.out.println(Massiv[i]);

        }


        int i = -1;

        do{
            i=i+2;
            System.out.println(Massiv[i]);
        }while(i < 10);


        for (int i = 1; i <= 5; i=i+2) {
            System.out.println(Massiv[i]);
        }


       for (int q : Massiv)
        {
            i=i+2;
            System.out.println(Massiv[i]);
        }






    }

}

