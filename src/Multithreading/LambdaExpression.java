package Multithreading;

/**
 *
 * Acheieving Multi-Threading can be done using following ways...
 * 
 * (i) By Extending Thread Class 
 * (ii) By Implementing Runnable Interface
 * 
 * LAMBDA EXPRESSION ::   () -> {
 *                                   Code Goes here....
 *                              }
 **/


public class LambdaExpression {

	public static void main(String[] args) {

		// Runnable obj1 = new Hii(); in order to use interface can use reference of " obj "
		// Runnable obj2 = new Helloo();
		Runnable obj1 = () ->
		{
				for (int i = 0; i < 5; i++) {
					System.out.println("Hi");
					try {Thread.sleep(1000);} catch (Exception e) {}
				}
			
		}; 
		
		Runnable obj2 = () ->
	    {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello");
					try {Thread.sleep(1000);} catch (Exception e) {}
				}
			
	    }; 

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
	}

}
