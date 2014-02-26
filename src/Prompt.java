import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

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
	    String[] fieldTitles = {"Continents:", "Countries:", "Cities:"};
	    JTextField[] textFields = new JTextField[fieldTitles.length];
        String[] fileNames = new String[fieldTitles.length];
	    
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));

        for (int i = 0; i < fieldTitles.length; i++)
        {
            textFields[i] = new JTextField(10);
            panel.add(new JLabel(fieldTitles[i]));
            panel.add(textFields[i]);            
        }
	    
        int result = JOptionPane.showConfirmDialog(null, panel, 
                "Please enter names of files:", JOptionPane.OK_CANCEL_OPTION);

        for (int i = 0; i < fieldTitles.length; i++)
        {
            fileNames[i] = textFields[i].getText();
        }
        
        if (result == JOptionPane.CANCEL_OPTION)
        {
            System.exit(0);
        }

        return fileNames;		
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
	public static void getOutputPreference(ArrayList<Region> list, String sortMethod) throws IOException
	{
		
		
		String [] options = {"Print to Screen","Print to File","Search for Particular Region"};
		
		
		
		
		  JRadioButton[] buttons = new JRadioButton[options.length];
	        ButtonGroup buttonGroup = new ButtonGroup();
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(options.length,1));
	        // Construct each button, add it to the group, and add it to the panel
	        for (int i = 0; i < options.length; i++)
	        {
	            buttons[i] = new JRadioButton(options[i]);
	            buttonGroup.add(buttons[i]);
	            panel.add(buttons[i]);
	        }

	        // Create a "JOptionPane" on which to put the panel
	        JOptionPane optionPane = new JOptionPane();
	        optionPane.setMessage("What would you like to do?:");
	        optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
	        optionPane.add(panel, 1);
	        // Create a JDialog on which to display the JOptionPane, with panel 
	        JDialog continueDialog = optionPane.createDialog(null,
	                "Print/Search Option");
	        continueDialog.setVisible(true);
		
		
		if(buttons[0].isSelected())
		{
			String lists = "";
			for(int i = 0; i <list.size(); i++)
			{
				lists = lists.concat(list.get(i).toString() + "\n");
			}
			lists = lists.substring(0, lists.length()-1);
			JScrollPane scrollPane = new JScrollPane(new JTextArea(lists));
			scrollPane.setPreferredSize(new Dimension(200,100));
			JOptionPane.showMessageDialog(null, scrollPane, "List",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(buttons[1].isSelected())
		{
			
			String filename = JOptionPane.showInputDialog(null, "What is the filename?");
			fileWriter(list,filename);
			
		}
		else if(buttons[2].isSelected())
		{
			
			String region = JOptionPane.showInputDialog(null, "What region would you like to know more about?");
			searchRegion(list, region, sortMethod);
		}

		return;
	}
	/*
	 * This writes the information to a file determined by the User
	 */
	public static void fileWriter (ArrayList<Region> list, String filename) throws IOException
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

	public static String searchRegion (ArrayList<Region> list, String region,String sortMethod)
	{
		
		String check = null;
		if(sortMethod.equals("Lexicographic"))
		{
			//should have a call to the Binary Search Method
			//and return something similar to what i have in the other if statement
		}
		for(int i = 0; i <list.size()-1;i++)
			{
			check = list.get(i).toString().toLowerCase();
			
			if(check.contains(region.toLowerCase()))
				{
					String info = check.toUpperCase() + ", " + list.get(i).getArea()+ ", " + list.get(i).getPop();
					JOptionPane.showMessageDialog(null, info);
					return check;
				}
			}
		
		
		region = JOptionPane.showInputDialog(null, "Invalid Region name, please enter a valid Region:");
		return searchRegion(list, region, sortMethod);
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
