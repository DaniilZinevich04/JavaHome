package Name_Bit;
import java.util.Scanner;
public class NameMain {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Добро пожаловать \n Как вас зовут? ");
        String name = a.next();
        String A = "Вася";
        String B = "Настя";

      /* на if else
       if (name.equalsIgnoreCase(A)) {
            System.out.println("Как дела, дружище ?");
        } else if (name.equalsIgnoreCase(B)) {
            System.out.println("Что нового красавица ?");
        } else {
            System.out.println((name) + " , кто ты по жизни?");
        }

        */

       /* на if
        if (name.equals(A) != name.equals(B)) {
            System.out.println("Давно не виделись ");
        } else {
            System.out.println(name + ", ты кто такой ?");
        }


       switch (name) {
           case1: String name = A;

           break;
           case2 : String
       }*/
        String hello;
        switch (name) {
            case "Вася":
                hello = "Приветик ";
                break;
            case "Настя":
                hello = "Я скучал";
                break;

                default:
                hello = name + " Кто ты?";
                break;
        }
        System.out.println(hello);
    }
}
