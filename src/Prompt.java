import java.util.*;

import javax.swing.*;
/*
 * This class will get the files as well as user input
 */
public class Prompt 
{
	/*
	 * This method will get the Files
	 */
	public static String[] getFiles()
	{
		/*
	    Scanner input = new Scanner(System.in);
		String[] files = new String[3];
		
		System.out.println("Enter the continents file:");
		files[0] = input.next();
		System.out.println("Enter the country file:");
		files[1] = input.next();
		System.out.println("Enter the cities file:");
		files[2] = input.next();
		
		return files;
		*/    
	    JTextField contField = new JTextField(10);
        JTextField countryField = new JTextField(10);
        JTextField cityField = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Continents:"));
        myPanel.add(contField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Countries:"));
        myPanel.add(countryField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Cities:"));
        myPanel.add(cityField);
	    
        int result = JOptionPane.showConfirmDialog(null, myPanel, 
                "Please enter names of files:", JOptionPane.OK_CANCEL_OPTION);
        
        String[] files = {contField.getText(), countryField.getText(), cityField.getText()};
        if (result == JOptionPane.CANCEL_OPTION)
        {
            System.exit(0);
        }
        return files;
		
	}
	/*
	 * This method will get the data type the user inputs
	 * (country,city,continent)
	 */
	public static ArrayList getDataType()
	{
		return null;
	}
	/*
	 * this will get the way the data will be sorted
	 * (elevation, population, name etc)
	 */
	public static ArrayList getSortMethod()
	{
		return null;
	}
	/*
	 * this will determine whether to output to console, file, or
	 * get further data
	 */
	public static void getOutputPreference()
	{
		
	}
	/*
	 * this will determine whether to continue with the program
	 */
	public static boolean getContinue()
	{
		return true;
	}
}
