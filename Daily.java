package appoiment;
	//method for daily activity in calendar.
public class Daily extends Appointment {
    public Daily(int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    @Override
    public String toString() {
        return  "Daily [" + this.getDescription() + " Date: " + this.getMonth()
                + "/" + this.getDay() + "/" + this.getYear() + "]";
    }
}