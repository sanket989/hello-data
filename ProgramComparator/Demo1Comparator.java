package ProgramComparator;

import java.util.Comparator;

public class Demo1Comparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer d=(Integer)o1;
		Integer d1=(Integer)o2;
		
		return -d.compareTo(d1);
	/*	if(d < d1)
		{
			return +1;
		}
		else if(d > d1)
		{
			return -1;
		}
		else
			
			
		return  0;*/
		
		
	}
	

}
