package Home.ed;

import static java.lang.Math.*;

public class CalculatoeWithMath extends CalculatorWithOperator{
    /* домашка вариант первый
        double stepen() {
            return pow(c, b);
        }

        double koren() {
            return sqrt(a);
        }

        double modul() {
            return abs(a);
        }
    }
    */
    public double stepen(double a, double b) {

        return pow(a, b);
    }
    double koren(double a) {
        return sqrt(a);
    }
    double modul(double a) {
        return abs(a);
    }

}

