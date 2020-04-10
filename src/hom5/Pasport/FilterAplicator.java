package hom5.Pasport;


import java.util.ArrayList;
import java.util.List;

public class FilterAplicator {
    public static void main(String[] args) {
        List elements = new ArrayList<>();
        System.out.println(elements);
        filter(elements,new Filter());
        System.out.println(elements);
    }
    public static void filter(List collect, Filter filter){
        filter.doFilter(collect);
    }
}

