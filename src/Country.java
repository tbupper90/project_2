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

/*
	HashMap<String, City> citiesHash = new HashMap<String,City>();
	
	public void makeHashMap()
	{
		for(City city : cities)
		{
			citiesHash.put(city.name, city);
		}
	}
*/
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
	
	/*	
	 public static Comparator<Region> NAME = new Comparator<Region>()
	 {
		@Override
		public int compare(Region o1, Region o2)
		{
			if(o1.getName().compareTo(o2.getName()) < 0)
			{
				return -1;
			}
			else if(o1.getName().compareTo(o2.getName()) > 0)
			{
				return 1;
			}
			else return 0;
		}
	 };
	*/
}


