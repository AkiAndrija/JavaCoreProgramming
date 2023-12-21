package ba.smoki.nine;

import java.time.Month;
import java.time.MonthDay;

public enum Season {
    //Season SUMMER = new Season(....)
    SPRING("Ljeto", MonthDay.of(3, 21), MonthDay.of(6, 20)),
    SUMMER("Proljeće", MonthDay.of(6, 21), MonthDay.of(9, 20)),
    AUTUMN("Jesen", MonthDay.of(9, 21), MonthDay.of(12, 20)),
    WINTER("Zima", MonthDay.of(12, 21), MonthDay.of(3, 20))
    ;
    private String name;
    private MonthDay startDate;
    private MonthDay endDate;

    private Season(String name, MonthDay startDate, MonthDay endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MonthDay getStartDate() {
        return startDate;
    }

    public void setStartDate(MonthDay startDate) {
        this.startDate = startDate;
    }

    public MonthDay getEndDate() {
        return endDate;
    }

    public void setEndDate(MonthDay endDate) {
        this.endDate = endDate;
    }
}
