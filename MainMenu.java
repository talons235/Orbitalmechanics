import javax.swing.*;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

public class Practice extends JFrame 
{
	static JFrame window = new JFrame();
	static ArrayList <JButton> button = new ArrayList <JButton>();
	static String [] names =
		{
			"Superior #", 
			"Quote #", 
			"Builder", 
			"Part #", 
			"Customer", 
			"Designer", 
			"Part Name", 
			"Invoice", 
			"CNC Programmer", 
			"Stock", 
			"Builder Report", 
			"Customer Report", 
			"Due Dates", 
			"Invoices", 
			"Hours", 
			"Time", 
			"Vacation Schedule",
			"Employee Records",
			"New Job"};
	
	static String [] purpose = 
		{
			"Option of open jobs, closed jobs, or all jobs.",
			"Can find all quotes with the same beginning numbers (there will be multiple quotes for 1 job, and multiple quotes can be activated to 1 job). \nCan find all quotes by searching a part number.",
			"Options to find all jobs built or any job that builder has put time on.",
			"Options open or closed. \nFind any jobs with the part number (not have to type in the entire number before results appear).",
			"Option to find open jobs, closed jobs or all jobs \nBe able to search by year.",
			"Options to find all job designed or any job that designer put time on.",
			"Options opened or closed. \nCan find jobs by typing in any of the name (does not have to be the complete name).",
			"Options by month, year, invoice number.",
			"Options to find all job cut or any job that CNC programmer put time on.",
			"Options of on hand or anything in the system. \nSearch by name or manufacture part number.",
			"Option of open or closed. \nBe able to list all jobs the builder is noted on with additional information of all jobs.",
			"Option of open or closed. \nBe able to list all jobs for that customer.",
			"Option of open or closed and for month or time frame. \nBe able to list jobs for that time frame.",
			"Be able to search by month or specified time frame.",
			"Options of design, build, CNC or all areas.",
			"Be able to enter in an employee number and note the jobs they worked on, how long, and what day.",
			"Be able to note all employee vacation on a calendar.",
			"Able to search individual employee records (vacation days used, and available, date of hire, personal information). \nBe able to search all disciplinary actions taken (write ups) prevent jerry l. Situation.",
			"Be able open a new job (activate quote(s))."
		};
	static ActionListener menuButton = new ActionListener()
	{
		public void actionPerformed(ActionEvent evt) { 
			JButton button = (JButton) evt.getSource();
			String ButtonName = button.getText();
			String Description = "";
			for(int y=0; y<19; y++) {
				if(ButtonName.equals(names[y])){
			    Description = purpose[y];
			    y=20;
				}
			}
			window.setVisible(false);
			PlaceHolderBox(ButtonName,Description);
			window.setVisible(true);
		}
	};  
	
	public static void main(String[] args) 
	{
		createWindow();
	}
	
	public static void createWindow(){
		window.setTitle("Test1");
		window.setSize(800,600);
		JFrame.setDefaultLookAndFeelDecorated(true);
		window.setLayout(new GridLayout(7, 5));
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Liner("Search");
		for (int x = 0; x < 19; x++)
		{
			button.add(new JButton(names[x]));
			window.add(button.get(x));
			button.get(x).addActionListener(menuButton);
			if(x==9){
				Liner("Reports");
			} else if(x==13){
				window.add(new JLabel(""));
				Liner("Operations");
			}
		}
		window.setVisible(true);
	}
	
	 public static void Liner(String Name){
		  window.add(new JLabel(Name));
		  window.add(new JLabel(""));
		  window.add(new JLabel(""));
		  window.add(new JLabel(""));
		  window.add(new JLabel(""));
		 }
	
	 public static void PlaceHolderBox(String Name, String Purpose){
		  JOptionPane.showOptionDialog(null, Purpose, Name,
		  JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		  null, null, null);
		 }

}
