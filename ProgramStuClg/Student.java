package ProgramStuClg;

public class Student implements Comparable 
{
	private int sid;
	private String name;
	private String address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*public int compareTo(Object o)
	{
		 Student s=(Student)o;
		 return this.sid-s.getSid();
		// return this.name.compareTo(s.getName());
	}*/
	public int compareTo(Object o1)
	{
		 Student s=(Student)o1;
		 //return this.sid-s.getSid();
		return this.name.compareTo(s.getName());
	}

}
