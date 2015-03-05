import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

public class Practice extends JFrame 
{
	static JFrame window = new JFrame();
	public static void main(String[] args) 
	{
		createWindow();
		
	}
	
	public static void createWindow(){
		window.setTitle("Test1");
		window.setSize(600,600);
		window.setDefaultLookAndFeelDecorated(true);
		window.setLayout(new GridLayout(5, 4));
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ArrayList <JButton> button = new ArrayList <JButton>();
		String [] names =
			{"Superior #",
				"Quote #",
				"Builder",
				"Part #",
				"Customer",
				"Designer",
				"Part Name",
				"Invoice",
				"CNC Programmer",
				"Stock",
				"Builder",
				"Customer",
				"Due Dates",
				"Invoices",
				"Hours",
				"Time",
				"Vacation Schedule",
				"Employee Records",
				"New Job"};
		
		for (int x = 0; x < 19; x++)
		{
			button.add(new JButton(names[x]));
			window.add(button.get(x));
		}
		window.setVisible(true);
	}

}
