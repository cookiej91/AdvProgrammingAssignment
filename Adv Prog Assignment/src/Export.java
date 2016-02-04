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
		File file = new File("C:\\Test.csv");
		
		if(!file.exists()){
			file.createNewFile();
		} 
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(AppointmentBook.appointmentList.toString());
		bw.close();
	} catch (IOException e){
		e.printStackTrace();
	}
	} 
	
	//Text
	public static void exportToText(){
		File file = new File("C:\\Test.txt");
		
		try {
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(AppointmentBook.appointmentList.toString());
		bw.close();
	} catch (IOException e){
		e.printStackTrace();
	}
	}
	
	//ICS
	public static void exportToICS(){
		try {
			File file = new File("C:\\Test.ics");
			
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(AppointmentBook.appointmentList.toString());
			bw.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}



}
