package Home.ed;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        System.out.print("Добро пожаловать \n Как вас зовут? ");
       Scanner Consol = new Scanner(System.in);
        String name = Consol.next();
        String A = "Вася";
        String C= "";
        String B = "Настя";
        boolean result1 = name.equalsIgnoreCase(A);
        boolean result2 = name.equalsIgnoreCase(B);
        if (result1) {
            System.out.println("Как дела, дружище ?");
        } else if (result2) {
            System.out.println("Что нового красавица ?");
        } else
        { System.out.println(name + ", кто ты есть по жизни ?"); }


    }

}

