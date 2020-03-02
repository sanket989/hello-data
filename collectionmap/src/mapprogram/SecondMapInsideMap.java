package mapprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecondMapInsideMap 
{
	public static void main(String[] args) 
	{
		List<String> mh=new ArrayList<String>();
		mh.add("pune");
		mh.add("amrawati");
		mh.add("nagpur");
		mh.add("aurangabad");
		
		List<String> mp=new ArrayList<String>();
		mp.add("bhopal");
		mp.add("indore");
		mp.add("seoni");
		mp.add("chhindwara");
		
		
		List<String> guj=new ArrayList<String>();
		guj.add("ahmadabad");
		guj.add("surat");
		guj.add("gandhinagar");
	
		
		List<String> pjb=new ArrayList<String>();
		pjb.add("ludhiana");
		pjb.add("amritsar");
		pjb.add("jalandhar");
		pjb.add("bathinda");
		
		
		List<String> ing=new ArrayList<String>();
		ing.add("ingland1");
		ing.add("ingland2");
		ing.add("ingland3");
		ing.add("ingland4");
		
		List<String> jrm=new ArrayList<String>();
		jrm.add("germany1");
		jrm.add("germany2");
		jrm.add("germany3");
		jrm.add("germany4");
		
		
		List<String> bsk=new ArrayList<String>();
		bsk.add("Biskek1");
		bsk.add("Biskek2");
		bsk.add("Biskek3");
	
		
		List<String> ame=new ArrayList<String>();
		ame.add("america1");
		ame.add("america2");
		ame.add("america3");
		ame.add("america4");
		
		
		Map<String,Object> india=new HashMap<String, Object>();
	
		india.put("maharastra", mh);
		india.put("madhyapradesh", mp);
		india.put("gujrat", guj);
		india.put("punjab", pjb);
		
		Map<String,Object> usa=new HashMap<String, Object>();
		
		usa.put("ingland", ing);
		usa.put("germany", jrm);
		usa.put("biskek", bsk);
		usa.put("america", ame);
		
    Map<String,Object> world=new HashMap<String, Object>();
		
		world.put("india", india);
		world.put("usa", usa);
		
		/*Set<String> keys=world.keySet();
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			
			System.out.println(key);
			
			Map<String, Object> countries=(Map<String, Object>)world.get(key);

			Set<String> keys1=countries.keySet();
			
			Iterator<String> itr1=keys1.iterator();
			while(itr1.hasNext())
			{
				String key1=(String)itr1.next();
				System.out.println(key1);
				
				List<String> states=(List<String>)countries.get(key1);
				Iterator<String> itr2=states.iterator();
				while(itr2.hasNext())
				{
					String city=(String)itr2.next();
					System.out.println("city:-    "+city);
							
				}
			}
			
			
					
		}
		*/
		Set<String> keys=world.keySet();
		for(Object key:keys)
		{
			System.out.println("countries    "+key);
			Map<String, Object> countries=(Map<String, Object>)world.get(key);
			Set<String> keys1=countries.keySet();
			for(Object key1:keys1)
			{
				System.out.println("States    "+key1);
				List<String> states=(List<String>)countries.get(key1);
				for(String s:states) {
					System.out.println("city    "+s);
				}
			}
			
		}
		
	
    }

}
