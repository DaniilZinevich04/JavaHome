package Enum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RegExMain {
    public static void main(String[] args) {
        String filePath = "\\Users\\Danch\\Downloads\\Война и мир.txt";
        String text = readAllBytesJava7(filePath);
        RegEx count = new RegEx();

        String wordSearch = "Пьер";

        System.out.println("Сборка слов \"" + wordSearch + "\" : " + count.textSearch(text, wordSearch));

    }


    private static String readAllBytesJava7(String filePath) {
        String inform = "";
        try {
            inform = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return inform;
    }

}
