package ProgramComparator;

import java.util.Set;
import java.util.TreeSet;

public class Demo1
{
	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<>(new Demo1Comparator());
		s.add(20);
		s.add(10);
		s.add(12);
		s.add(11);
		
		System.out.println(s);
		
		
		
		
		
		
	}

}
