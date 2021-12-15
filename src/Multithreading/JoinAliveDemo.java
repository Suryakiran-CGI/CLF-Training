package Multithreading;

public class JoinAliveDemo {

	public static void main(String[] args) throws Exception {

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
		
		System.out.println("Thread-1 is exist : "+t1.isAlive());
		//Join is a method which makes " main-Thread " to wait for other threads...
		t1.join();
		t2.join();
		
		//isAlive() is a method helps to detect either thread is alive or dead...
		//Note : if we use t1.isAlive() while execution - > true else false... 
		System.out.println("Thread-1 is exist : "+t1.isAlive());
		
		System.out.println("Bye");
		
	}

}
