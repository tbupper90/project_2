import java.io.*;
import java.util.*;

/*
 * This is the driver class and contains the main method, as well
 * as various methods that manipulate the files
 */
public class Driver 
{	
	
	private static ArrayList list;
	private static ArrayList<Continent> continents;
	private static String continentsFile;
	private static String countriesFile;
	private static String citiesFile;
	
	/*
	 * This is the main
	 */
	public static void main(String[] args) throws IOException
	{
		String[] files = new String[3];
		
		files = Prompt.getFiles();
		
		continentsFile = files[0];
		countriesFile = files[1];
		citiesFile = files[2];
		
		readFile(continentsFile);
		readFile(countriesFile);
		readFile(citiesFile);
		
		
		
	}
	/*
	 * this method reads in the file
	 */
	private static void readFile(String file) throws IOException
	{
		//opens and reads the file 
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line; //variable that stores the line temporarily 
		
		int test = 0; //tester for loop below
		
		//iterates through all the lines in the file and parses them using parseLine()
		do
		{
			line = br.readLine();
			if(line != null)
			{
				parseLine(line, file);
			}
			else
			{
				test = 1;
			}
		}while(test == 0);
		
		//closes the file 		
		br.close();
	}
	
	/*
	 * this method will split up the file
	 */
	private static void parseLine(String line, String file)
	{
		String[] array = line.split(",");
		
		assignVariables(array, file);
	}
	
	/*
	 * This method will assign the variables to their
	 * respective values
	 */
	private static void assignVariables(String[] array, String file)
	{		
		if(file == continentsFile)
		{
			Continent continent = new Continent(array[0],array[1],array[2]);
			continents.add(continent);
		}
		
		else if(file == countriesFile)
		{
			for(Continent i:continents)
			{
				if(array[4] == i.getName())
				{
					Country country = new Country(array[0],array[1],array[2],array[3]);
					i.addCountry(country);					
				}
			}
		}
		
		else if(file == citiesFile)
		{
			
		}
		
	}//end Assign

}//end class
