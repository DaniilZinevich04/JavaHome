package hom5.Pasport;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;


public class PasportList {
    public static void main(String[] args) {

        ArrayList<String> passportnumber = new ArrayList<String>(1_000_000);
        String pass;
        String symbols = "фвгдежзк1234567890абвгдеdasdasdasczcsdfe31r";
        Random random = new Random();



        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            pass = random.ints(14, 0, symbols.length())
                    .mapToObj(symbols::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());

            passportnumber.add(pass);
        }
        long delta = System.currentTimeMillis() - start;
        System.out.println("Размер массива 'njnuj  : " + passportnumber.size());
        System.out.println("Время добавленния элементов в массив  : " + delta + " ms\n");

    }
}
