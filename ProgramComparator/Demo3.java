package ProgramComparator;

import java.util.Set;
import java.util.TreeSet;

public class Demo3
{
	public static void main(String[] args) {
		
	
	Set s=new TreeSet<>(new Demo3Comparator());
	s.add(new StringBuffer("zzz"));
	s.add(new StringBuffer("sss"));
	s.add(new StringBuffer("fff"));
	s.add(new StringBuffer("ggg"));
	
	System.out.println(s);
	}
}
