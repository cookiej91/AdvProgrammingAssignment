import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 * Class javadoc comment
 * 
 *  The controller class will test the Appointment and AppointmentBook classes
 * @author 13141188
 *
 */
public class Controller {
	public static AppointmentBook appBook = new AppointmentBook();
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

	public static void addAppointment(Appointment appointment){
		appBook.add(appointment);
		appBook.ShowAllAppointments();
	}

	public static void removeAppointment(int index){
		ArrayList<Appointment> appointments = appBook.getAllAppointments();

		appointments.remove(index);
	}

	}
