import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Export class to export to CSV, Text and ICS formats
 * @author 13141188
 *
 */
public class Export {
	//CSV
	public static void exportToCSV(){
	try {
		File file = new File(System.getProperty("user.dir") + "/test.csv");

		if(!file.exists()){
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		String header = "Title, StartDate, EndDate\n";
		bw.write(header);
		for(Appointment appointment : Controller.appBook.getAllAppointments()){
			String title = appointment.getEventTitle();
			String startDate = appointment.getStartDateTime().getTime().toString();
			String endDate = appointment.getEndDateTime().getTime().toString();

			String csvFormat = String.format("%s, %s, %s\n", title, startDate, endDate);
			bw.write(csvFormat);
		}
		bw.close();
	} catch (IOException e){
		e.printStackTrace();
	}
	}



}
