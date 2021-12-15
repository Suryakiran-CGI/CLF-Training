package Oops;

/*
public class WrapperDemo {
	public static void main(String[] args) {
		int i = 5;  //Primitive datatype ...............[Note : faster than wrapper]
		Integer ii = new Integer(i); //Wrapper class or boxing means putting primitive inside wrapper
	    
		int j = ii.intValue();//Un boxing getting out of wrap
		Integer value = i; //default backend is auto boxing as new Integer(i)
		int k = value;//autoUnboxing
	}
}
*/

public class WrapperDemo {
	public static void main(String[] args) {
		String str = "123";
		int n = Integer.parseInt(str); //Since parseInt is static method it requires class Integer
		System.out.println(n);
	}
}