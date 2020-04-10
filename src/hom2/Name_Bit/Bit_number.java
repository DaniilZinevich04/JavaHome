package hom2.Name_Bit;

public class Bit_number {


    public static void main(String[] args) {
        byte x;  byte y=1;

        x = 42 | 15; ///11111111111111111111111111010110 /  11111111111111111111111111110001  ;  11111111111111111111111111110111           101010 | 1111;101111
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x);
        x  |= y;

        System.out.println(x);
        x = -42 & -15;  //42 & 15; 11111111111111111111111111010000
        System.out.println(x);
       x &=y;
       System.out.println(x);
        x = -42 ^ -15;  //42 ^ 15; 100111
       System.out.println(x);
       x^=y;
        System.out.println(x);

        x = -42>> -2; //42>> 2; 11111111111111111111111111111111
        System.out.println(x);
        x<<=y;
        System.out.println(x);

    }

    public static class Operation {
        public static void main(String[] args) {

            int y=2;int z =8;
            System.out.println("5.1 " + (5+y/8)); //5 2/8=0
            System.out.println("5.2 " + ((5+y)/8));//0  7/8=0
            System.out.println("5.3 " + ((5+y++)/8));//0 7/8=0
            System.out.println("5.4 " + (5+y++)/--z);// 1 8/7=1

            int r=2;  int d=68;
            System.out.println(("5.5 " + ((5*2>>r++)/--z)));// вышли за ячеки
            System.out.println(("5.6 " + (5+7>20?68:22*2>>r++)/--z));
           // System.out.println((("5.7 " + ((5+7>20:68=>d:22*2>>r++)/--z)));
            System.out.println(("5.8 " + (6-2>3&&12*12<=119)));//false tk true&&false - false
            System.out.println(("5.9 " + (true&&false)));//false tk true&&false - false











        }
    }
}

