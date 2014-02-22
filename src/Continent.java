import java.util.*;
/*
 * This Class creates a continent object
 */
public class Continent
{
	/*
	 * These are the arraylist of countries and the variables of
	 * the continent class
	 */
	ArrayList<Country> countries = new ArrayList<Country>();
	
	private String name;
	private String pop;
	private String area;
	
	/*
	 * creates a continent object
	 */
	public Continent(String name, String pop, String area)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
	}
	/*
	 * these methods will get the different variables of the 
	 * continent object
	 */
	public String getName()
	{
		return name;
	}
	
	public String getPop()
	{
		return pop;
	}
	
	public String getArea()
	{
		return area;
	}
	/*
	 * This method will add a country to the 
	 */
	public void addCountry(Country country)
	{
		countries.add(country);
	}
	
	public ArrayList<Country> getCountries()
	{
		return countries;
	}
	
	public String toString()
	{
		return name + ": " + countries + "\n";
	}
	
	
	
}
