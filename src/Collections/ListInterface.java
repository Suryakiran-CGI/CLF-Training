package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List values = new ArrayList();
		
		values.add(3);
		values.add(5);
		values.add(7);
		values.add(9);
		values.add(1,2);
		
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}

	}

}
