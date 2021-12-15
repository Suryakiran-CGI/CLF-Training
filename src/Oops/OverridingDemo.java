package Oops;

/* @Overriding is to override super cls method with subclass;
class AA{
	public void show() {
		System.out.println("In A");
	}
}

class BB extends AA{
	//@Override
	public void show() {
		super.show();
		System.out.println("In B");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		AA a = new AA();
        //a.show();
        BB b = new BB();
        b.show();
	}

}
*/

class AA{
	public void show() {
		System.out.println("In A");
	}
}

class BB extends AA{
	//@Override
	public void show() {
		//super.show();
		System.out.println("In B");
	}
}

class CC extends AA{
	public void show() {
		//super.show();
		System.out.println("In C");
	}
}

/*                                  _______[Run time]
 * [Polymorphism]      -------------|
 *                                 _______[Compile time]
 *                                 */

public class OverridingDemo {
	public static void main(String[] args) {
		AA a = new AA();
        //a.show();
        AA b = new BB();   // reference of AA with obj of BB [ RUN TIME POLYMORPHSM ]
        b.show();     
        
        b = new CC(); //Same referece of c cls obj   [ Dynamic dispatch ]
        b.show();
	}

}