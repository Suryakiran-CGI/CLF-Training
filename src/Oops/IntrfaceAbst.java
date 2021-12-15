package Oops;

/*
abstract class Author1{
	public abstract void show();
}

class Pen2 extends Author1{
	public void show(){System.out.println("Im a pen");}
}

class Pencil2 extends Author1{
	public void show(){System.out.println("Im a pencil");}
}

class kit2{
	public void disp(Author1 p) {
		p.show();
	}
	
}

public class IntrfaceAbst {
	public static void main(String[] args) {
		kit2 k = new kit2();
		Author1 p = new Pen2();
		Author1 pc = new Pencil2();
		
		k.disp(pc);
	}

}
*/

interface Driver{
	public abstract void disp();  //Interface define methods just holds methods as default abstracts
}

class Bus implements Driver{
	public void disp() {System.out.println("Driver in Bus");}
}

class Car implements Driver{
	public void disp() {System.out.println("Driver in car");}
}

class Status{
	public void show(Driver x) {
		x.disp();
	}
}

public class IntrfaceAbst{
	public static void main(String[] args) {
		Driver bus = new Bus();    //Reference of interface with class object to follow implement
		Driver car = new Car();
		Status st =new Status();
		
		st.show(car);
	}
}











