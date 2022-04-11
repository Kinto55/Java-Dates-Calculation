package appoiment;

public class Appointment {

    private int year,month,day;
    private String description;

    public Appointment(int year, int month, int day, String description) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
    }

    boolean occursOn(int year, int month, int day) {
        return this.year == year && this.month == month && this.day == day;
    }
    //Methods to get and set a description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //Methods to get and set year/month/days
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  "Appointment [" + description + " Date: " + month
                + "/" + day + "/" + year + "]";
    }
    //Creating the calendar
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        //create some appointments and add them to our calendar
        //note the method calls here imply that
        //your Appointment class will need to have a 4 argument constructor
        //that accepts year, month, day, and description
        //the first call is year:2000, month: 8, day: 13
        calendar.add(new Daily(2000, 8, 13, "Brush your teeth."));
        calendar.add(new Monthly(2003, 5, 20, "Visit grandma."));
        calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));
        calendar.add(new Onetime(2004, 10, 31, "Trick or Treat."));
        calendar.add(new Monthly(2004, 11, 2, "Dentist appointment."));
        calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));

        //note here we can simply use + calendar because we have
        //implemented the toString() method
        System.out.println("Before removal of appointment " + "\n" + calendar);
        calendar.remove(2004, 11, 2);
        //note that the daily appointment is removed because it occurs on
        //11/2/2004 (as well as many other days).  
        System.out.println("After removal of 11/2/2004 " + "\n" + calendar);
        
}
}
