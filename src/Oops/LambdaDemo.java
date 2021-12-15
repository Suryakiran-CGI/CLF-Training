package Oops;

/*
//functional interface
interface New{
	void show();
}

public class LambdaDemo {
	public static void main(String[] args) {
		
		//New n = () -> System.out.println("In Show method"); Anonymous class defining using LAMBDA EXPRESSION
		
		New n = new New() 
		{
			public void show() {
				System.out.println("In show");
			}
		};
        n.show();
	}

}*/


interface Demo{
	void disp();
	default void show() {
		System.out.println("Im showing");
	}
}

class ImpDemo implements Demo{
	public void disp() {
		System.out.println("Im implementing");
	}
}

public class LambdaDemo {
	public static void main(String[] args) {
		
		Demo dm = new ImpDemo();
		dm.show();
		dm.disp();
	}
}







