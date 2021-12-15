package Collections;

import java.util.*;



public class setInterface {

	public static void main(String[] args) {
		
	    Set<Integer> s = new HashSet<>();//Unordered seq of elem
	    
	    s.add(new Integer(6));
	    s.add(new Integer(4));
	    s.add(new Integer(9));
	    s.add(new Integer(6));
	    
	    for(int n : s) {
	    	System.out.println(n);
	    }
	    
	    
		Set<Integer> s1 = new TreeSet<>();//Ordered seq of elem

		s1.add(new Integer(4));
		s1.add(new Integer(6));
		s1.add(new Integer(9));
		s1.add(new Integer(6));

		for (int n : s1) {
			System.out.println(n);
		}
	}

}
