import java.util.*;

public class Continent 
{
	private static ArrayList<Country> countries;
	
	private String name;
	private String pop;
	private String area;
	
	
	public Continent(String name, String pop, String area)
	{
		this.name = name;
		this.pop = pop;
		this.area = area;
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

}
