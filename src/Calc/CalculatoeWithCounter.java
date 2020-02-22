package Calc;

import java.util.Scanner;

public class CalculatoeWithCounter extends CalculatoeWithMath {
   CalculatorWithOperator A = new CalculatorWithOperator();
   CalculatoeWithMath B = new CalculatoeWithMath();
   /* Scanner r = new Scanner(System.in);
    double Counter1 ;
    CalculatorWithOperator A = new CalculatorWithOperator();
    double E = A.suma(1,2,3);
    double B = A.chast(100,5);
    CalculatoeWithMath C = new CalculatoeWithMath();
    private void Counter1(double A, double B) {if (E < B) {E++;}
System.out.println(E);}
private double Counter2 (double a,double b){return C.raz(10,8);}*/




    public CalculatoeWithCounter() {

    }

    @Override
    public double suma(double a, double b, double c) {
        return super.suma(a,b,c);

    }

    @Override
    public double raz(double a, double b) {
        return super.raz(a, b);
    }

    @Override
    public double proiz(double a, double b) {
        return super.proiz(a, b);
    }

    @Override
    public double chast(double a, double b) {
        return super.chast(a, b);
    }

}

