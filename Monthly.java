package appoiment;
	//method for monthly activity in calendar.
public class Monthly extends Appointment{
    public Monthly(int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    @Override
    public String toString() {
        return  "Monthly [" + this.getDescription() + " Date: " + this.getMonth()
                + "/" + this.getDay() + "/" + this.getYear() + "]";
    }
}