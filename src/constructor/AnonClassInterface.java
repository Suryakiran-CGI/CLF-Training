package constructor;

interface A{
	void show();// {System.out.println("in A");}
}
/*
class B extends A{
	void show() {System.out.println("In B");}
}*/

public class AnonClassInterface {
	public static void main(String[] args) {
		A a = new A() {
			public void show() {System.out.println("In B");}
		};
		a.show();
	}
}
