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
<<<<<<< HEAD
	public void showAllAppointments(){
=======
	public static void showAllAppointments(){
>>>>>>> b891913bff5b8357fde5881432c2db4185da34a3
		ArrayList<Appointment> all = new ArrayList<Appointment>(appointmentList);
		System.out.println();
		System.out.println("All Appointments");
		
		for (Appointment a: all){
			System.out.println(a);
			System.out.println();
		}
	}
	
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
	
	/**
	 * find specific appointment using variable named stored in ArrayList
	 * @param a
	 * @return
	 */
	public boolean isInBook(Appointment a){
		return find(a) != NOTFOUND;
	}
	
}
