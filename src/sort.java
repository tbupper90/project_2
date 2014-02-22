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
	
	public static void sortByLon(ArrayList<City> cities)
	{
		
	}
	
	public static void sortByElev(ArrayList<City> cities)
	{
		
	}
	
	public static ArrayList<Region> sortLexi(ArrayList<Region> list)
	{
		Collections.sort(list, Region.Comparators.NAME);
		return list;
	}
	
	public static void sortRandomly(ArrayList<Region> list)
	{
		
	}
	
	
}
