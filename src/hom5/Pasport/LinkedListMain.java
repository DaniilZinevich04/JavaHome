package hom5.Pasport;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListMain {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> passNumber = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            passNumber.add(random.nextInt(10000000) + 1);
        }

        System.out.println("LinkedList - " + passNumber);
        long fin = System.currentTimeMillis();
        long res = fin - start;
        SimpleDateFormat sdf = new SimpleDateFormat("SS");
        System.out.print("Вемя добавления  : ");
//        System.out.print(sdf.format(fin) + "мс - ");
//        System.out.print(sdf.format(start) + "мс = ");
        System.out.println(sdf.format(res) + "мс");

        long startRem = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            passNumber.removeAll(passNumber);
        }
        long finishRem = System.currentTimeMillis();
        long resultRemove = finishRem - startRem;
        System.out.print("Время удаления : ");
//        System.out.print(sdf.format(finishRem) + "мс - ");
//        System.out.print(sdf.format(startRem) + "мс = ");
        System.out.println(sdf.format(resultRemove) + "мс");
    }

}
