package appoiment;

import java.util.ArrayList;
import java.util.List;
	//creating the calendar
public class Calendar {

    private ArrayList<Appointment> appointments;

    public Calendar() {
        appointments = new ArrayList<>();
    }

    public void add(Appointment apt) {
        this.appointments.add(apt);
    }

    /**

     * A method to remove an appointment from the calendar.

     * the Daily appointment will be removed as well. (Because occursOn() * willreturn true in this case). This is a limitation we will

     * accept for now.

     * @param year - the year of the appointment to remove

     * @param month - the month of the appointment to remove

     * @param day - the day of the appointment to remove

     */

    public void remove(int year, int month, int day) {

        ArrayList<Appointment> temp = new ArrayList<>();
        for (Appointment appointment : appointments){
            if(appointment.occursOn(year,month,day)){
                temp.add(appointment);
            }
        }
        appointments.removeAll(temp);
    }

    /**

     * Method to return a string representation of this Calendar object.

     */

    public String toString() {

        String ret = "";

        for (Appointment appointment : appointments){
            ret = ret + "\n" + appointment;
        }
        return ret;
    }

}