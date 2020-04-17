package ProgramComparator;

import java.util.Comparator;

public class NameSort implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)o1;
		Employee emp1=(Employee)o2;
		
		return emp.getName().compareTo(emp1.getName());
	}
	
	

}
