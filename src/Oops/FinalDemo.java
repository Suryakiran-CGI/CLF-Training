package Oops;

/*

class x{
	final int i=0; // Constant
	public x() {
		i = 10;
	}
}


public class FinalDemo {

	public static void main(String[] args) {
		x obj1 = new x();
		System.out.println(obj1.i);
	}

}
*/

class x{
	public /*final*/ void show() {    //final method cannt be overrided
		System.out.println("In x show");
	}
}
class y extends x{                   //final class cannot be extended
	
	public void show() {
		System.out.println("In y show");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		//x ob1= new x();
		y obj = new y();
		obj.show();
	}

}