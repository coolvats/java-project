
public class StringDemo {
    
	public static void main(String [] args)
	{
		String demo = "Hello";
		String demo2 = "Hello";
		demo.concat("World");
		System.out.println(demo);
		String demo1 = new String("Hello");
		System.out.println(demo.equals(demo1));
		System.out.println(demo==demo2);
		for(int i = demo.length()-1;i>=0;i--)
		{
			System.out.print(demo.charAt(i));
		}
		System.out.println();
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb==sb1);
	}
	
	
}
