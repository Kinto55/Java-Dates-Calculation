package appoiment;

public class Onetime extends Appointment {
		//one time method for onetime calendar appointment
    public Onetime(int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    @Override
    public String toString() {
        return  "Onetime [" + this.getDescription() + " Date: " + this.getMonth()
                + "/" + this.getDay() + "/" + this.getYear() + "]";
    }
}