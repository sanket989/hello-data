package ProgramComparator;

import java.util.Comparator;

public class Demo2Comparator  implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		//String s=(String)o1;//valid
		String s=o1.toString();//valid
		String s1=(String)o2;
		
		return s1.compareTo(s);//return -s.compareTo(s1);
	}
	

}
