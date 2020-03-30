package Enum;

import java.awt.geom.Area;

public enum ECountry implements ICountry {
    Belarus(191_123,2_223_212),
    Russa(123_213,2_113_222),
    SCOTLAND(78_722, 5_438_000),
    Argentina(12_1,0);

    private int area;
    private int people;
    ECountry( int area,int people){
        this.area=area;
        this.people = people;

    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPeople() {
        return people;
    }



}


