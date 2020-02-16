package Home.ed;

public class CalculatorWithOperator {
    /* ПЕрвый вариант домашки
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
    double  suma(double a,double c,double b) {
        a = a+b+c;
        return  a;
    }

    double raz(double a,double b ) {
        a=a-b;
        return a ;
    }

    double proiz(double a,double b) {
        a *=  b;
        return a ;
    }

    double chast(double a,double b) {

        double c= a / b;
        return  c;
    }


}
