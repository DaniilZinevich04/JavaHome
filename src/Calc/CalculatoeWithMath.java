package Calc;

import static java.lang.Math.*;

public class CalculatoeWithMath extends CalculatorWithOperator{

    public double step(double a, double b) {

        return pow(a, b);
    }
    double koren(double a) {
        return sqrt(a);
    }
    double modul(double a) {
        return abs(a);
    }

}

