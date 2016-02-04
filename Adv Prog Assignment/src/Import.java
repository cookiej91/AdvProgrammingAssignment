import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Import {
/*	//CSV
	public static void importToCSV(){
	try {
		File file = new File("H:\\test.csv");

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
	public static void importToText(){*/
/*		try {
		File file = new File("H:\\test.txt");
		
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.read();
			System.out.println(AppointmentBook.appointmentList.toString());
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*//*

		
	}

	
	//ICS
	public static void importToICS(){
		try {
			File file = new File("H:\\test.ics");
			
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
	}*/
}

