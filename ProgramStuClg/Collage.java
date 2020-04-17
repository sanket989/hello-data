package ProgramStuClg;


import java.util.Set;
import java.util.TreeSet;

public class Collage
{
	public Set<Student> m1()
	{
		Set<Student> s=new TreeSet<>();
		Student stu=new Student();
		stu.setSid(105);
		stu.setName("anket");
		stu.setAddress("pune");
		

		
		Student stu1=new Student();
		stu1.setSid(104);
		stu1.setName("hitesh");
		stu1.setAddress("pune");
		
		s.add(stu);
		s.add(stu1);
		
		return s;
		
	}

}
