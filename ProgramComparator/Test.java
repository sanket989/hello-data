package ProgramComparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	
	public static void main(String[] args) {
		
		
		
		Set<Employee> set=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Emter your choice ");
		System.out.println("1 IdSort");
		System.out.println("2 NameSort");
		
		int ch=sc.nextInt();
	
		switch(ch)
		{
		case 1:
		{
			set=new TreeSet<>(new EidSort());
		}
		case 2:
		{
			set=new TreeSet<>(new NameSort());
		}
		
		
		
		}
	
		
		Employee emp=new Employee();
		System.out.println("enter your employee id");
		emp.setEid(sc.nextInt());
		System.out.println("enter your name");
		emp.setName(sc.next());
		System.out.println("enter your address");
		emp.setAddress(sc.next());
		
		System.out.println("enter your age ");
		emp.setAge(sc.nextInt());
		System.out.println("enter your mobile no ");
		emp.setMobileno(sc.nextLong());
		
		Employee emp1=new Employee();
		emp1.setEid(101);
		emp1.setName("anita");
		emp1.setAddress("katangi");
		emp1.setAge(45);
		emp1.setMobileno(8855224477l);
		
		set.add(emp);
		set.add(emp1);
		
		for(Employee em:set)
		{
			System.out.println(em.getEid());
			System.out.println(em.getName());
			System.out.println(em.getAddress());
			System.out.println(em.getAge());
			System.out.println(em.getMobileno());
			System.out.println("------------------------------------");
		}
		
		
		
	}

}
