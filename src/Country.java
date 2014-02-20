import java.util.*;

/*
 * this class creates a Country object
 */
public class Country 
{
	/*
	 * an arraylist of cities, as well as the variables for a country
	 * object
	 */
	private static ArrayList<City> cities;
	
	private String name;
	private String pop;
	private String area;
	private String continent;
	
	/*
	 * creates a Country object
	 */
	public Country(String name, String pop, String area, String continent)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.continent = continent;
	}
	/*
	 * these methods will get the different variables of
	 * the City object
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
	
	public String getContinent()
	{
		return continent;
	}
	/*
	 * this method will add a city to the city array list
	 */
	public void addCountry(City city)
	{
		
	}
	
	
	
}
