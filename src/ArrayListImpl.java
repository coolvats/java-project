import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListImpl {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		alist.add("Sagar");
		alist.add("Quazi");
		alist.add("Vats");
		alist.add("Ashima");
		//for each
		System.out.println("By foreach method");
		for(String al : alist)
		{
			System.out.println(al);
		}
		//Iterator
		System.out.println("By Iterator");
		Iterator itr = alist.iterator();
		System.out.println("forward approach");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Backward approach");
		System.out.println(alist);
		ListIterator<String> litr = alist.listIterator();
		
		while(litr.hasPrevious())
		{
			String s = litr.previous();
			System.out.println(s);
		}
		System.out.println("Enumeration");
		Enumeration enu = Collections.enumeration(alist);
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		

	}

}
