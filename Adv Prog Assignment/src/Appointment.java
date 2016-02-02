import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * original Appointment set up
 * events/title/date
 * @author 13141188
 *
 */
public class Appointment {
	//Appointments have a start date and time
	// and an end date and time
	//Each appointment has a title
	
	private GregorianCalendar startDateTime;
	private GregorianCalendar endDateTime;
	private String eventTitle;
	
	//default constructor
	public Appointment() {
		this.startDateTime = null;
		this.endDateTime = null;
		this.eventTitle = "";
	}
	
	//Constructor
	public Appointment(GregorianCalendar startDate, GregorianCalendar endDate, String eventTitle){
		this.startDateTime = startDate;
		this.endDateTime = endDate;
		this.eventTitle = eventTitle;
	}
	
	public GregorianCalendar getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(GregorianCalendar startDateTime) {
		this.startDateTime = startDateTime;
	}
	public GregorianCalendar getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(GregorianCalendar endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	
	//we need to write a toString() method to return a string representation of an appointment object
	
	public String toString(){
		String strdate = null;
		int hours = 0;
		String hrs = null;
		int mins = 0;
		String min = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		if(getStartDateTime() != null){
			strdate = sdf.format(getStartDateTime().getTime());
			hours = getStartDateTime().get(Calendar.HOUR);
			hrs = Integer.toString(hours);
			mins = getStartDateTime().get(Calendar.MINUTE);
			min= Integer.toString(mins);
		}
		
		String s = getEventTitle() + " " + strdate + " " + hrs + ": " + min;

		return "Appointment: " + s;
	}
}
