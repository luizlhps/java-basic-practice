package entites;

import java.time.LocalDate;

public class HourContract {
    private final LocalDate date;
    private final double valuePerHour;
    private final int hours;

    public int getHours() {
        return hours;
    }

    public HourContract(LocalDate date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

    public LocalDate getDate(){
        return date;
    }
}