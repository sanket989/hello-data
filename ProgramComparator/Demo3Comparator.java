package ProgramComparator;

import java.util.Comparator;

public class Demo3Comparator  implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s=o1.toString();
		String s1=o2.toString();
		
		return s.compareTo(s1);
	}

}
