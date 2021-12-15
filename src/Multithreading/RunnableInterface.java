package Multithreading;

/**
 *
 * Acheieving Multi-Threading can be done using following ways...
 * 
 * (i) By Extending Thread Class
 * (ii) By Implementing Runnable Interface
 * 
**/

class Hii implements Runnable{ 
	// Inorder to achieve multiple inheritance use interface RUNNABLE consists only run() method no start()
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

class Helloo implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		
		Hii obj1 = new Hii();        //		Runnable obj1 = new Hii(); in order to use interface can use reference of " obj " 
		Helloo obj2 = new Helloo();  //		Runnable obj2 = new Helloo();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
	}

}
