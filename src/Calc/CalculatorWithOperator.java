package Calc;

import java.util.Scanner;

public class CalculatorWithOperator implements ICalc {

    @Override
    public double suma(double a, double b,double c) {
        return  a+b+c;
    }

    @Override
    public double raz(double a, double b) {
        return a-b;
    }

    @Override
    public double proiz(double a, double b) {
        return a*b;
    }

    @Override
    public double chast(double a, double b) {
        return a/b;
    }

    @Override
    public double stepen(double a, double b) {
        double res=1;
        for (int i=1;i<=b;i++){
            res = res*a;
        }
        return res;
    }
}