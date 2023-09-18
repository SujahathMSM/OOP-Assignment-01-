package Mainq25;

public class Demo {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.printDate();

        d1.setYear(2016);
        d1.setMonth(5);
        d1.setDay(31);

        System.out.println("year: "+ d1.getYear());
        System.out.println("Month: "+ d1.getMonth());
        System.out.println("Day: "+ d1.getDay());

    }
}
