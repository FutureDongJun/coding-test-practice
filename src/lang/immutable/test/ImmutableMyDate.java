package lang.immutable.test;

import lang.immutable.change.ImmutableObj;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate setDate(int setYear, int setMonth, int setDay) {
        int result1 = setYear;
        int result2 = setMonth;
        int result3 = setDay;
        return new ImmutableMyDate(setYear, setMonth, setDay);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
