import java.util.*;
import java.awt.GridLayout;
import java.io.*;

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
	    JTextField contField = new JTextField(10);
        JTextField countryField = new JTextField(10);
        JTextField cityField = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        panel.add(new JLabel("Continents:"));
        panel.add(contField);
        panel.add(new JLabel("Countries:"));
        panel.add(countryField);
        panel.add(new JLabel("Cities:"));
        panel.add(cityField);
	    
        int result = JOptionPane.showConfirmDialog(null, panel, 
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
	public static String getDataType()
	{
        String[] dataChoices = {"All continents", "All countries", "All cities",
                "All countries within a continent",
                "All cities within a country"};
        // Create radio buttons, a group in which to tie them together,
        // and a panel on which to place them
        JRadioButton[] buttons = new JRadioButton[dataChoices.length];
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(dataChoices.length,1));
        // Construct each button, add it to the group, and add it to the panel
        for (int i = 0; i < dataChoices.length; i++)
        {
            buttons[i] = new JRadioButton(dataChoices[i]);
            buttonGroup.add(buttons[i]);
            panel.add(buttons[i]);
        }

        // Create a "JOptionPane" on which to put the panel
        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage("Show information for:");
        optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
        optionPane.add(panel, 1);
        // Create a JDialog on which to display the JOptionPane, with panel 
        JDialog continueDialog = optionPane.createDialog(null,
                "What type of data?");
        continueDialog.setVisible(true);

        // Set the return String equal to the choice made
        String result = "";
        for (int i = 0; i < dataChoices.length; i++)
        {
            if (buttons[i].isSelected()) result = dataChoices[i];
        }
        
        // Override choices for countries and cities within areas
        if (buttons[3].isSelected())
        {
            result = "_countrieswithin_" + JOptionPane.showInputDialog(null,
                    "Which continent?");
            // Add while loop later to confirm valid entry
        }
        else if (buttons[4].isSelected())
        {
            result = "_citieswithin_" + JOptionPane.showInputDialog(null,
                    "Which country?");          
            // Add while loop later to confirm valid entry
        }
        	
		return result;
	}
	/*
	 * this will get the way the data will be sorted
	 * (elevation, population, name etc)
	 */
	public static String getSortMethod(String dataType)
	{
        String[] sortChoices;
        if (dataType.contains("cities"))
        {
            sortChoices = new String[] {"Area", "Population", "Latitude",
                                        "Longitude", "Elevation",
                                        "Lexicographic", "Random"};
        }
        else
        {
            sortChoices = new String[] {"Area", "Population", "Lexicographic",
                                        "Random"};
        }

        // Create radio buttons, a group in which to tie them together,
        // and a panel on which to place them
        JRadioButton[] buttons = new JRadioButton[sortChoices.length];
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(sortChoices.length,1));
        // Construct each button, add it to the group, and add it to the panel
        for (int i = 0; i < sortChoices.length; i++)
        {
            buttons[i] = new JRadioButton(sortChoices[i]);
            buttonGroup.add(buttons[i]);
            panel.add(buttons[i]);
        }

        // Create a "JOptionPane" on which to put the panel
        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage("Sort by:");
        optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
        optionPane.add(panel, 1);
        // Create a JDialog on which to display the JOptionPane, with panel 
        JDialog continueDialog = optionPane.createDialog(null,
                "Which information to sort by?");
        continueDialog.setVisible(true);

        // Set the return String equal to the choice made
        String result = "";
        for (int i = 0; i < sortChoices.length; i++)
        {
            if (buttons[i].isSelected()) result = sortChoices[i];
        }            
        
        return result;
	}
	/*
	 * this will determine whether to output to console, file, or
	 * get further data
	 */
	public static void getOutputPreference(ArrayList list) throws IOException
	{
		Scanner input = new Scanner(System.in);
		String preference = null;
		System.out.println("What would you like to ouput to");
		preference = input.nextLine();
		if(preference.equals("PS"))
		{
			System.out.println(list);
		}
		if(preference.equals("PF"))
		{
			System.out.println("What is the file name?:");
			String filename = input.nextLine();
			fileWriter(list,filename);
		}
		if(preference.equals("SP"))
		{
			System.out.println("What country do you wish to know more about?");
			String region = input.nextLine();
			



		}

		
	}
	/*
	 * This writes the information to a file determined by the User
	 */
	public static void fileWriter (ArrayList list, String filename) throws IOException
	{
		FileWriter outfile = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(outfile);
		String line = null;
		for(int i = 0; i < list.size()-1; i++)
		{
			line = list.get(i).toString();
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		
	}

	public static String searchRegion (ArrayList list, String region)
	{
		Scanner input = new Scanner(System.in);
		String check = null;
		for(int i = 0; i <list.size()-1;i++)
			{
			check = list.get(i).toString().toLowerCase();
			if(check.contains(region.toLowerCase()))
				{
					return check;
				}
			}
		System.out.println("Invalid Region, Please re-enter the region:");
		region = input.nextLine();
		return searchRegion(list, region);
	}	
	/*
	 * this will determine whether to continue with the program
	 */
	public static boolean getContinue()
	{
        int result = JOptionPane.showConfirmDialog(null, 
                "Would you like to continue?", 
                "Continue?", 
                JOptionPane.YES_NO_OPTION); 
        
        return (result == JOptionPane.YES_OPTION);

	}
}
