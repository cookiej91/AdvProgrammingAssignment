import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.swing.*;

/**
 * Original GUI design
 * @author 13141188
 *
 */
public class BasicForm{
	private static DefaultListModel listModel = new DefaultListModel();
	private static JList<String> dataList = new JList(listModel);

	protected static void createAndShowGUI(){
		JFrame frame = new JFrame("Appointment Book");
		frame.setSize(600,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}
/**
 * placing Jpanels to GUI and inputting methods
 * @param panel
 */
	public static void placeComponents(JPanel panel) {

		panel.setLayout(null);
		
		//date label and text field
		JLabel dateLabel = new JLabel("Date");
		dateLabel.setBounds(10, 10, 80, 25);
		panel.add(dateLabel);
		
		DateFormat dayFormat = new SimpleDateFormat("dd");
		final JFormattedTextField dayTextField = new JFormattedTextField(dayFormat);
		dayTextField.setBounds(50,10,25,25);
		panel.add(dayTextField);

		DateFormat monthFormat = new SimpleDateFormat("MM");
		final JFormattedTextField monthTextField = new JFormattedTextField(monthFormat);
		monthTextField.setBounds(110,10,25,25);
		panel.add(monthTextField);

		DateFormat yearFormat = new SimpleDateFormat("yyyy");
		final JFormattedTextField yearTextField = new JFormattedTextField(yearFormat);
		yearTextField.setBounds(170,10,50,25);
		panel.add(yearTextField);

		JLabel startTime = new JLabel("Start Time");
		startTime.setBounds(265, 10, 80, 25);
		panel.add(startTime);

		final JTextField startHrsTimeInput = new JTextField(4);
		startHrsTimeInput.setBounds(340, 10, 25, 25);
		panel.add(startHrsTimeInput);

		final JTextField startMinsTimeInput = new JTextField(2);
		startMinsTimeInput.setBounds(370, 10, 25, 25);
		panel.add(startMinsTimeInput);

		JLabel endTime = new JLabel("End Time");
		endTime.setBounds(265, 40, 80, 25);
		panel.add(endTime);

		final JTextField endHrsTimeInput = new JTextField(4);
		endHrsTimeInput.setBounds(340, 40, 25, 25);
		panel.add(endHrsTimeInput);

		final JTextField endMinsTimeInput = new JTextField(2);
		endMinsTimeInput.setBounds(370, 40, 25, 25);
		panel.add(endMinsTimeInput);

		// appointment title text field and label
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setBounds(10, 40, 80, 25);
		panel.add(titleLabel);

		final JTextField titleText = new JTextField(20);
		titleText.setBounds(50, 40, 170, 25);
		panel.add(titleText);

		//Array

		final JList<String> dataList = new JList(listModel);
		dataList.setBounds(10,200,500,100);
		panel.add(dataList);

		for (int i = 0; i < dataList.getModel().getSize(); i++){
			System.out.println(dataList.getModel().getElementAt(i));
		}

		//Add Remove and Show Buttons
		JButton addButton = new JButton("Add Appointment");
		addButton.setBounds(10, 80, 160, 25);
		panel.add(addButton);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//needs to know what is being added

				int year = Integer.parseInt(yearTextField.getText());
				int month = Integer.parseInt(monthTextField.getText()) - 1;
				int day = Integer.parseInt(dayTextField.getText());

				int startTimeMin = Integer.parseInt(startMinsTimeInput.getText());
				int startTimeHrs = Integer.parseInt(startHrsTimeInput.getText());

				int endTimeMin = Integer.parseInt(endMinsTimeInput.getText());
				int endTimeHrs = Integer.parseInt(endHrsTimeInput.getText());
				GregorianCalendar startDate = new GregorianCalendar(year, month, day, startTimeHrs, startTimeMin);
				GregorianCalendar endDate = new GregorianCalendar(year, month, day, endTimeHrs, endTimeMin);

				Appointment appointment = new Appointment(startDate, endDate, titleText.getText());
				Controller.addAppointment(appointment);
				//acts as a refresh
				listModel.removeAllElements();
				//update list model from appBook
				for(Appointment apt : Controller.appBook.getAllAppointments()){
					listModel.addElement(apt.toString());
				}
			}
		});

		JButton removeButton = new JButton("Remove Appointment");
		removeButton.setBounds(180, 80, 160, 25);
		panel.add(removeButton);
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//needs to know what to remove
				Controller.removeAppointment(dataList.getSelectedIndex());
				listModel.removeAllElements();

			}
		});
		
		JButton showAllButton = new JButton("Show Appointments");
		showAllButton.setBounds(350, 80, 160, 25);
		panel.add(showAllButton);
		showAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppointmentBook.ShowAllAppointments();


			}
		});
		
		
		//appointments set not working
		
	}
}
