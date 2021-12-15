package Collections;

import java.util.*;


public class ComparatorInterface {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();

		lst.add(263);
		lst.add(239);
		lst.add(732);
		lst.add(238);
		
		Comparator<Integer> c = new Comparator<Integer>()
		{
			public int compare(Integer i , Integer j) {
				
				return (i%10 > j%10) ? 1 : -1;
			}
		};
				
				
		Collections.sort(lst,c);;
		System.out.println(lst);

	}

}
