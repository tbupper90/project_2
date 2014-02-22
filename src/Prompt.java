import java.util.*;
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
	public static String getDataType()
	{
		String[] dataChoices = {"All continents", "All countries", "All cities",
		                      "All countries in a continent",
		                      "All cities within a country"};
		
		Object choice = JOptionPane.showInputDialog(null, "Show information for:",
		        "What type of data?", JOptionPane.QUESTION_MESSAGE, null,
		        dataChoices, dataChoices[0]);
		
		if (choice.equals(dataChoices[3]))
		{
		    choice = "_countrieswithin_" + JOptionPane.showInputDialog(null,
		            "Which continent?");
		    // Add while loop later to confirm valid entry
		}
		else if (choice.equals(dataChoices[4]))
		{
            choice = "_citieswithin_" + JOptionPane.showInputDialog(null,
                    "Which country?");		    
            // Add while loop later to confirm valid entry
		}
		
		return choice.toString();
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

        Object choice = JOptionPane.showInputDialog(null, "Sort by:",
                "How to sort the data?", JOptionPane.QUESTION_MESSAGE, null,
                sortChoices, sortChoices[0]);
        
        return choice.toString();
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
		return true;
	}
}
