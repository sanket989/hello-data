package ProgramStuClg;

import java.util.Iterator;
import java.util.Set;


public class test 
{
	public static void main(String[] args) {
		
		
		Collage c= new Collage();
		Set<Student> ss=c.m1();
		Iterator<Student> itr=ss.iterator();
		while(itr.hasNext())
		{
			Student stu=itr.next();
			System.out.println(stu.getSid());
			System.out.println(stu.getName());
			System.out.println(stu.getAddress());
		}
		
		
	}

}
