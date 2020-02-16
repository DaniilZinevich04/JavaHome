package Home.ed;

import java.util.Scanner;

public class CalculatoeWithCounter {
    Scanner r = new Scanner(System.in);
    double Counter1 = r.nextInt();

    void Counter1 (double a, double b ) {
        if (a < b) {
            a++;
        }
        System.out.println(Counter1);
    }

    public double Counter2 (double a,double b){
        return a-b;

    }
}
