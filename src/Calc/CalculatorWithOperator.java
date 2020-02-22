package Calc;

import java.util.Scanner;

public class CalculatorWithOperator implements ICalc {

    @Override
    public double suma(double a, double b) {
        return  a+b;
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
}