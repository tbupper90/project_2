import java.util.*;

/*
 * This class contains all of the Sort methods
 */
public class sort 
{
	/*
	 * These are the different sort methods
	 */
	public static ArrayList<Region> sortByArea(ArrayList<Region> list)
	{
	
		Collections.sort(list, Region.Comparators.AREA);
		return list;
		
	}
	
	public static ArrayList<Region>  sortByPopulation(ArrayList<Region> list)
	{
		Collections.sort(list, Region.Comparators.POP);
		return list;
	}
	
	public static ArrayList<City> sortByLat(ArrayList<City> cities)
	{
		Collections.sort(cities, City.Comparators.LAT);
		return cities;
		
	}
	
	public static ArrayList<City> sortByLon(ArrayList<City> cities)
	{
		Collections.sort(cities, City.Comparators.LON);
		return cities;
	}
	
	public static ArrayList<City> sortByElev(ArrayList<City> cities)
	{
		Collections.sort(cities, City.Comparators.ELEV);
		return cities;
	}
	
	public static ArrayList<Region> sortLexi(ArrayList<Region> list)
	{
		Collections.sort(list, Region.Comparators.NAME);
		return list;
	}
	
	public static ArrayList<Region> sortRandomly(ArrayList<Region> list)
	{
		Collections.shuffle(list);
		return list;
	}
	
	
}
