package Oops;

/*

//What is Abstract class
abstract class Human{  //No one can instanciate class human or create object it is done by abstract keyword
	public abstract void eat();
	public void sleep() {
		
	}
}
//Concrete class
class Man extends Human{
	public void eat() {
		System.out.println("Time to eat");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
        Human h = new Man();		//Declaration shld be abstract reference with extend cls Man object
        h.eat();
	}

}


*/

abstract  class Writer{
	public abstract void  Start();
	public abstract void Stop();
}

class Pen extends Writer{
	public void Start() {
		System.out.println("Pen - Welcome Page");
	}
	public void Stop() {
		System.out.println("Pen - The End");
	}
}

class Pencil extends Pen{
	public void Stop() {
		System.out.println("Pencil - The End");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
        Writer wt = new Pen();
        wt.Start();
        wt.Stop();
        wt = new Pencil();
        wt.Start();
        wt.Stop();
	}

}










