package Home.ed;

import java.util.Scanner;

public class CalculatorWithOperator implements ICalc {
    /* Первый вариант домашки
       double suma() {
           b = c + a;
           return b;
       }

       double raz() {
           a = a - b;
           return a;
       }

       double proiz() {
           a *= b;
           return a;
       }

       public double chast() {

           c = a / b;
           return c;
       }

      */
    Scanner W = new Scanner(System.in);
    double a = W.nextInt();
    double b = W.nextInt();
    double c = W.nextInt();

    public double suma(double a, double b, double c) {
        a = a + b + c;
        return a;
    }

    public double raz(double a, double b) {
        a = a - b;
        return a;
    }

    public double proiz(double a, double b) {
        a *= b;
        return a;
    }


   public double chast(double a,double b) {

        double c= a / b;
        return  c;
    }


}
