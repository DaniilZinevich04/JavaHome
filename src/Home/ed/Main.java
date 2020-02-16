package Home.ed;

import java.util.Scanner;

   import static java.lang.Math.*;

    public class Main {

        public static void main(String [] args) {
            double a = 223;
            CalculatorWithOperator A = new CalculatorWithOperator();
            CalculatoeWithMath B = new CalculatoeWithMath();

       /* Первый вариант домашки
       A.a = 28;
        A.b = 5;

        B.c = A.chast();// результат деления
        B.b = 2;

        A.c = B.stepen();// деление возвели в степень
        A.a = 15;
        A.b = 7;
        A.a = A.proiz();// умножение
        A.a += 4.1 ;// результат умножения скалдывается с числом
        System.out.println(A.suma());// сумма пред действия со строкой 16
        A.b = A.suma();
        A.c = A.b /    0.0d;
        System.out.println(A.c);
    }
    */
            Scanner r = new Scanner(System.in);
            int d = r.nextInt();
            A.suma(10,5,0);
            double c = B.suma(B.proiz(15,7) ,B.stepen(B.chast(28.0,5.0),2),4.1);
            System.out.println(c);
            System.out.println( c /0.0d);

            System.out.println( );


        }

    }