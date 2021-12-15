package Oops;

/*
 * Types of interface
 * 1.Normal
 * 2.Single abstract method
 * 3.Marker Interface
 */

abstract class Author{
	public abstract void show();
}

class Pen1 extends Author{
	public void show(){System.out.println("Im a pen");}
}

class Pencil1 extends Author{
	public void show(){System.out.println("Im a pencil");}
}

class kit{
	public void disp(Author p) {
		p.show();
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		kit k = new kit();
		Author p = new Pen1();
		Author pc = new Pencil1();
		
		k.disp(pc);
	}

}
