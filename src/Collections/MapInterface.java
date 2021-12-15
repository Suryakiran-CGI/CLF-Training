package Collections;

import java.util.*;


public class MapInterface {

	public static void main(String[] args) {
        
        Map<String,Integer> mp = new HashMap();//Unordered Hash
        
        mp.put("Abhi",20);
        mp.put("Sai",21);
        
        System.out.println(mp);
        
        
		Map<String, Integer> mp1 = new TreeMap();//Ordered Hash

		mp1.put("Abhi", 20);
		mp1.put("Sai", 21);

		System.out.println(mp1);
	}

}
