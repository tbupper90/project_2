import java.util.*;
/*
 * This class will create a City Object
 * 
 * 
 */

public class City extends Region 
{
	/*
	 * This will add the specific variables to the
	 * City Object
	 */

	private String country;
	private String lat;
	private String lon;
	private String elev;
	
	/*
	 * This method will create the city object, without latitude
	 * longitude and elevation
	 */
	public City(String name, String pop, String area, String country)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.country = country;
		this.lat = "";
		this.lon = "";
		this.elev = "";
	}
	/*
	 * This method will create a city object with all variables filled
	 */
	public City(String name, String pop, String area, String country, String lat, String lon, String elev)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.country = country;
		this.lat = lat;
		this.lon = lon;
		this.elev = elev;
	}
	/*
	 * These methods will get the different variables of the City
	 */
	
	public String getCountry()
	{
		return country;
	}
	
	public String getLat()
	{
		return lat;
	}
	
	public String getLon()
	{
		return lon;
	}
	
	public String getElev()
	{
		return elev;
	}
	
	public String toString()
	{
		return name;
	}
	
	public static class Comparators
	{
		public static Comparator<City> LAT = new Comparator<City>()
		{
			@Override
			public int compare(City o1, City o2)
			{
				if(o1.getLat().compareTo(o2.getLat()) < 0)
				{
					return -1;
				}
				
				else if(o1.getLat().compareTo(o2.getLat()) > 0)
				{
					return 1;
				}
				
				else return 0;
			}
		};
		
		public static Comparator<City> LON = new Comparator<City>()
		{
			@Override
			public int compare(City o1, City o2)
			{
				if(o1.getLon().compareTo(o2.getLon()) < 0)
				{
					System.out.println(o1.getLon() + " " + o2.getLon());
					System.out.println("-1");
					return -1;
				}
				
				else if(o1.getLon().compareTo(o2.getLon()) > 0)
				{
					System.out.println(o1.getLon() + " " + o2.getLon());
					System.out.println("1");
					return 1;
				}
				
				else return 0;
			}
		};
		
		public static Comparator<City> ELEV = new Comparator<City>()
		{
			@Override
			public int compare(City o1, City o2)
			{
				if(o1.getElev().compareTo(o2.getElev()) < 0)
				{
					return -1;
				}
				
				else if(o1.getElev().compareTo(o2.getElev()) > 0)
				{
					return 1;
				}
				
				else return 0;
			}
		};
		
	
	}



	
	
}
