package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		
        Collection values = new ArrayList();
        
        values.add(4);
        values.add(3);
        values.add(7);
        
        Iterator i = values.iterator();
        
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
