package ProgramComparator;

import java.util.Set;
import java.util.TreeSet;

public class Demo2 
{
	public static void main(String[] args) {
		
		Set<String> s=new TreeSet<>(new Demo2Comparator());
		s.add("sanket");
		s.add("anita");
		s.add("jaya");
		s.add("satish");
		s.add("siddhika");
		System.out.println(s);
		
		
		
	}

}
