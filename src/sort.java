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
	
	public static <E> void sortByPopulation(ArrayList<E> list)
	{
		
	}
	
	public static void sortByLat(ArrayList<City> cities)
	{
	}
	
	public static void sortByLon(ArrayList<City> cities)
	{
		
	}
	
	public static void sortByElev(ArrayList<City> cities)
	{
		
	}
	
	public static void sortLexi(ArrayList<?> list)
	{
		//Collections.sort(list);
	}
	
	public static void sortRandomly(ArrayList<?> list)
	{
		
	}
	
	
}
