import java.util.*;

/*
 * this class creates a Country object
 */
public class Country extends Region
{
	/*
	 * an arraylist of cities, as well as the variables for a country
	 * object
	 */
	ArrayList<City> cities = new ArrayList<City>();
	

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
	
	public String getContinent()
	{
		return continent;
	}
	/*
	 * this method will add a city to the city array list
	 */
	public void addCity(City city)
	{
		cities.add(city);
	}
	
	public String toString()
	{
		return name;
	}
	
	public static class Comparators
	{
		public static Comparator<Country> AREA = new Comparator<Country>()
		{
			@Override
			public int compare(Country o1, Country o2)
			{
				if(o1.getArea().compareTo(o2.getArea()) < 0)
				{
					return -1;
				}
				
				else if(o1.getArea().compareTo(o2.getArea()) > 0)
				{
					return 1;
				}
				
				else return 0;
			}
		};
	}
}


