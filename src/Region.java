import java.util.*;


abstract class Region 
{
	protected String name;
	protected String pop;
	protected String area;
	
	
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
	
	public static class Comparators
	{
		public static Comparator<Region> AREA = new Comparator<Region>()
		{
			@Override
			public int compare(Region o1, Region o2)
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
		
		 public static Comparator<Region> POP = new Comparator<Region>()
		 {
			@Override
			public int compare(Region o1, Region o2)
			{
				if(o1.getPop().compareTo(o2.getPop()) < 0)
				{
					return -1;
				}
				else if(o1.getPop().compareTo(o2.getPop()) > 0)
				{
					return 1;
				}
				else return 0;
			}
		 };
		 
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
		 
		 
		 
	}
}
