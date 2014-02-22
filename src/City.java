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
		this.lat = null;
		this.lon = null;
		this.elev = null;
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
	
	
	
	
}
