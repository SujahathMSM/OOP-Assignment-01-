package Mainq25;

public class Date {
    private int year = 1970;
    private int month = 1;
    private int day = 1;

    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        if (month >1  && month <=12) {
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day.");
        }
    }
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void printDate() {
        System.out.println(year+"-"+month+"-"+day);
    }
}
