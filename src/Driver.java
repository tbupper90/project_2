import java.io.*;
import java.util.*;

/*
 * This is the driver class and contains the main method, as well
 * as various methods that manipulate the files
 */
public class Driver 
{	
	
	private static ArrayList<Region> list;
	private static ArrayList<Region> list2;
	private static ArrayList<Continent> continents = new ArrayList<Continent>();
	private static String continentsFile;
	private static String countriesFile;
	private static String citiesFile;
	
	private static HashMap<String, Continent> continentsHash = new HashMap<String, Continent>();
	
	
	
	/*
	 * This is the main
	 */
	public static void main(String[] args) throws IOException
	{
		boolean continueTest = true;
		do{
		//files are in args for simplicity
//		continentsFile = args[0];
//		countriesFile = args[1];
//		citiesFile = args[2];
		
		//get correct files
		String[] files = Prompt.getFiles();
		continentsFile = files[0];
		countriesFile = files[1];
		citiesFile = files[2];
		
		//read in the files and assign the data contained within
		readFile(continentsFile);
		readFile(countriesFile);
		readFile(citiesFile);
			
		String dataType = Prompt.getDataType();
		
		System.out.println(list);
				
		list = sort.sortTypeOfData(continents, dataType);
		
		System.out.println(list.get(0));
		
		String sortMethod = Prompt.getSortMethod(dataType);
		
//		System.out.println(list);
		
		list = sort.performSort(list, sortMethod);
		
//		System.out.println(list);
		
		Prompt.getOutputPreference(list, list2, sortMethod);
		
		continueTest = Prompt.getContinue();
		
		}while(continueTest);
		
		System.exit(0);
	}
	
	
	public static void makeHashMaps(ArrayList<Continent> list)
	{
		for(Continent continent : list)
		{
			continentsHash.put(continent.getName(), continent);
			continent.makeHashMap();
		}	
		
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
		String[] array = line.split(", ");
		
		assignVariables(array, file);
	}
	
	/*
	 * This method will assign the variables to their
	 * respective values
	 */
	private static void assignVariables(String[] array, String file)
	{		
		if(file.equals(continentsFile))
		{
			continents.add(new Continent(array[0],array[1],array[2]));	
		}
		
		else if(file.equals(countriesFile))
		{
			Country country = new Country(array[0],array[1],array[2],array[3]);
			
			for(Continent continent : continents)
			{
				if(continent.getName().equals(country.getContinent()))
				{
					continent.countries.add(country);
					break;
				}
			}
			
		}//end else if
		
		else if(file.equals(citiesFile))
		{
			
			if(array.length == 7)
			{
				City city = new City(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
				
				for(Continent continent : continents)
				{
					for(Country country : continent.countries)
					{
						if(country.getName().equals(city.getCountry()))
						{
							country.cities.add(city);
							System.out.println(city.getName() + " added to " + country.getName());
						}
					}//end country for
				}//end continent for
			}//end if 
			
			else
			{
				City city = new City(array[0],array[1],array[2],array[3]);
				
				for(Continent continent : continents)
				{
					for(Country country : continent.countries)
					{
						if(country.getName().equals(city.getCountry()))
						{
							country.cities.add(city);
							System.out.println(city.getName() + " added to " + country.getName());
						}
					}//end country for
				}//end continent for
			}//end else
			
		}
		
	}//end Assign

}//end class
