package Name_Bit;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Добро пожаловать \n Как вас зовут? ");
        String name = a.next();
        String A ="Вася";
        String B =  "Анатасия ";
        System.out.println(A);
        if (name == A){
            System.out.println("Как дела, дружище ?");}
        else if (name == B) {
            System.out.println("Что нового красавица ?");
        }




    }
}
