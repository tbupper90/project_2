import java.util.*;


public class City 
{
	
	private String name;
	private String pop; 
	private String area;
	private String country;
	private String lat;
	private String lon;
	private String elev;
	
	
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
	
	

}
