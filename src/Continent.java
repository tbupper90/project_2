import java.util.*;
/*
 * This Class creates a continent object
 */
public class Continent extends Region
{
	/*
	 * These are the arraylist of countries and the variables of
	 * the continent class
	 */
	ArrayList<Country> countries = new ArrayList<Country>();

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
	 * This method will add a country to the Array list
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
		return name;
	}
	
	
}
