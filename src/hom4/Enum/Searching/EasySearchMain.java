package hom4.Enum.Searching;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;

public class EasySearchMain {
    public static void main(String[] args) {
        EasySearch search = new EasySearch();
        String file = "C:\\Users\\Danch\\Downloads\\Война и мир.txt";
        System.out.println("Повторы слова \"мир\": " + search.search(readAllBytes(file)," мир")+" раз/а");
        System.out.println("Повторы слова \"и\": " + search.search(readAllBytes(file)," и")+" раз/а");
        System.out.println("Повторы слова \"война\": " + search.search(readAllBytes(file)," война")+" раз/а");
        System.out.println("Повторы слова \"риа\": " + search.search(readAllBytes(file)," риа")+" раз/а");
    }

    private static String readAllBytes(String file){
        String info = "";
        try {
            info = new String(Files.readAllBytes(Paths.get(file)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return info;
    }
}
