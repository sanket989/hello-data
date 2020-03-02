package mapprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Firstmap 
{
	public static void main(String[] args) 
	{
		
		List<String> mh=new ArrayList<>();
		
	mh.add("pune");
	mh.add("nagpur");
	
	List<String> mp=new ArrayList<>();
	mp.add("bhopal");
	mp.add("indore");
	
	Set<String> guj=new HashSet<>();
	guj.add("ahmadabad");
	guj.add("surat");
	
	Set<String> up=new HashSet<>();
	
	up.add("lakhnaw");
	up.add("jhansi");
	
	Map<String, Collection> india=new HashMap<>();
	india.put("maharastra", mh);
	india.put("madhyapradesh", mp);
	india.put("gujrat", guj);
	india.put("uttarpradesh", up);
	
	System.out.println(india);
	// for use of iterator
	/*Set<String> keys=india.keySet();
	
	Iterator<String> itr=keys.iterator();
	while(itr.hasNext())
	{
		String key=itr.next();
		System.out.println(key);
		
		Collection<String> city=india.get(key);
		Iterator<String> itr1=city.iterator();
		while(itr1.hasNext())
		{
			String n=(String)itr1.next();
			System.out.println("city:-   "+n);
		}
	}
		*/
	// for inhance for loop
	Set<String> keys=india.keySet();
	for(Object o:keys)
	{
		System.out.println("states    "+o);
		Collection<String> c=india.get(o);
		for(String s:c)
		{
			System.out.println("city   "+s);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
