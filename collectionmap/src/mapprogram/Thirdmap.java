package mapprogram;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Thirdmap
{
	public static void main(String[] args)
	{
		List<String> mh=new LinkedList<>();
		mh.add("pune");
		mh.add("aurangabad");
		mh.add("amrawati");
		mh.add("nagpur");
		
		List<String> mp=new LinkedList<>();
		mp.add("indore");
		mp.add("bhopal");
		mp.add("chhindwara");
		mp.add("jabalpur");
		
	
		List<String> guj=new LinkedList<>();
		guj.add("gandhinagar");
		guj.add("ahmadabad");
		guj.add("surat");
		guj.add("porbandar");
		
		Set<String> cal=new LinkedHashSet<>();
		cal.add("california1");
		cal.add("california2");
		cal.add("california3");
		
		Set<String> am=new LinkedHashSet<>();
		am.add("america1");
		am.add("america2");
		am.add("america3");
		
		
		Map<String,Object> india=new LinkedHashMap<>();
		india.put("maharastra", mh);
		india.put("madhyapradesh",mp);
		india.put("gujrat", guj);
		
		Map<String,Object> usa=new LinkedHashMap<>();
		usa.put("california", cal);
		usa.put("america", am);
		
		Map<String, Object> world=new  LinkedHashMap<>();
		
		world.put("india", india);
		world.put("usa", usa);
		System.out.println(world);
		
		
		/*for(Object o:keys)
		{
			System.out.println("countries   "+o);
			Map<String, Object> m=(Map<String, Object>)world.get(o);
			
			Set<String> keys1=m.keySet();
			for(Object o1:keys1)
			{
				System.out.println("States    "+o1);
				Collection<String> c=(Collection<String>)m.get(o1);
				
				for(String city:c)
				{
					System.out.println("city    "+city);
				}
				
			}
			*/
		
		Set<String> keys=world.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			System.out.println("countries   "+o);
			
			Map<String, Object> m=(Map<String,Object>)world.get(o);
			
			Set<String> keys1=m.keySet();
			Iterator<String> itr1=keys1.iterator();
			while(itr1.hasNext())
			{
				Object o1=itr1.next();
				System.out.println("states    "+o1);
			Collection<String> c=(Collection<String>)m.get(o1);
			Iterator<String> itr2=c.iterator();
			while(itr2.hasNext())
			{
				String s1=itr2.next();
				System.out.println("city    "+s1);
			}
			}
		}
			
			
	}

}
