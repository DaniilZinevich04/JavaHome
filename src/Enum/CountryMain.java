package Enum;

public class CountryMain  {
    public static void main(String[] args) {
        System.out.println("Area : "+ECountry.Belarus.getArea());
        System.out.println("Area : "+ECountry.Russa.getPeople());
        Integer a =Integer.valueOf(ECountry.Russa.getArea());
        boolean b = a == ECountry.Russa.getArea();
        System.out.println(b);









    }
}
