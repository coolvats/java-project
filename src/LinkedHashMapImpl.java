import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		System.out.println("In ArrayList");
		List<String> alist = new ArrayList();
		alist.add("Hello");
		alist.add("Welcome");
		alist.add("Sayonara");
		synchronized(alist)
		{
			for(String al : alist)
			{
				System.out.println(al);
			}
		}
		System.out.println("In HashSet");
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		
		Set<String> synchronizedSet = Collections.synchronizedSet(set);
		synchronized(synchronizedSet)
		{
			Iterator itr = set.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		System.out.println("In HashMap");
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"V");
		map.put(3, "R");
		
		Map<Integer,String> synchronizedMap = Collections.synchronizedMap(map);
		Set<Integer> keySet = synchronizedMap.keySet();
		
		synchronized(synchronizedMap)
		{
			Iterator<Integer> itr =  map.keySet().iterator();
			while(itr.hasNext())
			{
			 System.out.println(itr.next());
			}
			
		}
		
		Collection values = map.values();
		synchronized(synchronizedMap)
		{
			Iterator itr = values.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
	}

}
