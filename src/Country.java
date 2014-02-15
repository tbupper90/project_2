import java.util.*;


public class Country 
{
	
	private static ArrayList<City> cities;
	
	private String name;
	private String pop;
	private String area;
	private String continent;
	
	
	public Country(String name, String pop, String area, String continent)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
		this.continent = continent;
	}
	
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
	
	
	
	
}
