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
        if (name.equalsIgnoreCase(A)) {
            System.out.println("Как дела, дружище ?");
        } else if (name.equalsIgnoreCase(B)) {
            System.out.println("Что нового красавица ?");
        } else
        {
            System.out.println(name + ", кто ты есть по жизни ?");


        }
    }
}

