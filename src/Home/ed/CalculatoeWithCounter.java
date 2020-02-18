package Home.ed;

import java.util.Scanner;

public class CalculatoeWithCounter {
    Scanner r = new Scanner(System.in);
    double Counter1 ;
    CalculatorWithOperator A = new CalculatorWithOperator();
    double E = A.suma(1,2,3);
    double B = A.chast(100,5);
    CalculatoeWithMath C = new CalculatoeWithMath();
    private void Counter1(double A, double B) {
        if (E < B) {
            E++;

        }
        System.out.println(E);

    }


   private double Counter2 (double a,double b){
        return C.raz(10,8);

    }
}
