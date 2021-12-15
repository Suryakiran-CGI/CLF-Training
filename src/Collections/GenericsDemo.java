package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		//Generic data type
		List<Integer> lst = new ArrayList<Integer>();
        
		lst.add(3);
		lst.add(9);
		lst.add(-2);
		lst.add(1,23);
		//lst.add("Hello"); String not allowed
	    Collections.sort(lst);
	    //Collections.reverse(lst);
	    
		
		System.out.println(lst);
	}

}
