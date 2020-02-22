package Calc;

import java.util.Scanner;

public class Main {

        public static void main(String [] args) {
            CalculatoeWithMath B = new CalculatoeWithMath();
            Scanner W = new Scanner(System.in);//4.1+15*7+(28/5)^2
            System.out.println("Пример по шаблону a+b*c+(d/x)^z ");
            System.out.println("Введите a");
            double a = W.nextDouble();
            System.out.println("Введите b");
            double b = W.nextInt();
            System.out.println("Введите c");
            double c = W.nextInt();
            System.out.println("Введите d");
            double d = W.nextInt();
            System.out.println("Введите x");
            double x = W.nextInt();
            System.out.println("Введите z");
            double z = W.nextInt();
           // System.out.println("Введите e");
            //double e = W.nextInt();

      //(2*4+16/2)^2+2/2


           // System.out.println("Ответ : " +  (B.suma(B.stepen((B.proiz(a,b)+B.chast(c,d)),x),B.chast(z,e))));
            System.out.println("Ответ : " + (B.suma(a,B.proiz(b,c),B.stepen(B.chast(d,x),z))));
            System.out.println(a);




        }

    }