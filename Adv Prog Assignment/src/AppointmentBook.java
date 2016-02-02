import java.util.ArrayList;

/**
 * AppointBook class to hold appointment methods
 * and store appointments
 * @author 13141188
 *
 */
public class AppointmentBook {
	
	private static final int NOTFOUND = -1; //NOTFOUND int constant
	
	//We can use an ArrayList to store appointments (you could use a database)
	
	public static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	//Now write an add method to add appointments to the appointment list
	
	/**
	 * Adds an appointment to the appointment list
	 * @param a
	 */
	public void add(Appointment a){
		appointmentList.add(a);
	}
	
	/**
	 * ArrayList to store appointments and return all stored appointments
	 * @return
	 */
	public ArrayList<Appointment> getAllAppointments(){
		return appointmentList;
	}
	
	/**
	 * Print out all appointments in arrayList
	 */
	public static void ShowAllAppointments(){
		ArrayList<Appointment> all = new ArrayList<Appointment>(appointmentList);
		System.out.println();
		System.out.println("All Appointments");
		
		for (Appointment a: all){
			System.out.println(a);
			System.out.println();
		}
	}
	
	// We need a method to find the location of a particular appointment
	
	/**
	 * Note returns -1 if no appointment found
	 * @param tofind
	 * @return
	 */
	private int find(Appointment tofind){
		int i = 0;
		for(Appointment a: appointmentList){
			if(a.equals(tofind)) return i;
			i++;
		}
		return NOTFOUND;
	}
	
	/**
	 * remove appointments created
	 * @param toRemove
	 */
	
	public void remove(Appointment toRemove){
		int location = find(toRemove);
		if(location != NOTFOUND) appointmentList.remove(location);
		else
			throw new IllegalArgumentException("Appointment not found");
		
	}
	
	//need a method to determine if an appointment is in the book
	
	/**
	 * find specific appointment using variable named stored in ArrayList
	 * @param a
	 * @return
	 */
	public boolean isInBook(Appointment a){
		return find(a) != NOTFOUND;
	}
	
}
