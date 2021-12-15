package Oops;

class A{
	public A() {
		System.out.println("Block A");
	}
	public A(int x) {
		System.out.println("Int Block A");
	}

}
class B extends A{
	public B() {
		//super.B(); //Incase of B not inherit and need Parameter/ non with B
		System.out.println("Block B");
	}
	public B(int y) {
		super(y);
		System.out.println("Int Block B");
	}

}

public class SuperDemo {
	public static void main(String[] args) {
		/*Non parameterized const() call
		A a = new A();
		B b = new B();  Default super() calls so out=A,B;
		*/
		
		/*parameterized const() call
		A a = new A(5);
		B b = new B(10); B super(parametered) so out has only paramet blocks
		*/
		
		A a = new A(5);
		B b = new B(10);
	}
}
