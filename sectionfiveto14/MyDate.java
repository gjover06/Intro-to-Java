package chapter11.sectionfiveto14;
import java.util.GregorianCalendar;

public class MyDate {
    int year;
    int month;
    int day;

    MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    }
    MyDate(long elapsedTime){
        setDate(elapsedTime);
    }
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }
    //return year
    public int getYear(){
        return year;
    }


    //return month
    public String getMonth(){
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);

    }

    /** Sets a new date for the object using the elapsed time */
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
