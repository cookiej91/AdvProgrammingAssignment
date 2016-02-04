import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 * 
 *  The controller class will test the Appointment and AppointmentBook classes
 * @author 13141188
 *
 */
public class Controller {

	public static AppointmentBook appBook = new AppointmentBook();
	public static ArrayList<Appointment> getAllAppointments(){
		return appBook.getAllAppointments();
	}

	public static void main(String[] args){
		BasicForm.createAndShowGUI();
		
		Appointment a1 = new Appointment(new GregorianCalendar(2015,8+1,14,10,30), new GregorianCalendar(2015,10,14,11,30),"Dentist");
		
		Appointment a2 = new Appointment(new GregorianCalendar(2015,8+1,14,8,30), new GregorianCalendar(2015,10,14,9,00),"Tutorial");

		appBook.add(a1);
		appBook.add(a2);
		
		System.out.println("------");
		System.out.println("Find test: " + appBook.isInBook(a2));
		appBook.remove(a2);
		System.out.println("------");
		System.out.println("Find test: " + appBook.isInBook(a2));
	}

	/**
	 * adding the appointment
	 * @param appointment
	 */
	public static void addAppointment(Appointment appointment){
		appBook.add(appointment);
		appBook.showAllAppointments();
	}

	/**
	 * removing at index (on selection from JList)
	 * @param index
	 */
	public static void removeAppointment(int index){
		ArrayList<Appointment> appointments = appBook.getAllAppointments();
		appointments.remove(index);
	}

	}