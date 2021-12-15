package Multithreading;
/**
 * Priority order :
 * 
 *     [1 - 10]
 *     
 **/

public class ThreadPriority{

	public static void main(String[] args) throws Exception {
		
		Runnable obj1 = () ->
		{
		        for(int i=0;i<5;i++) {
			        System.out.println("Green "+Thread.currentThread().getPriority());
		         	try {Thread.sleep(1000);} catch(Exception e) {}
		        }
		};
		Runnable obj2 = () ->
		{
		        for(int i=0;i<5;i++) {
			        System.out.println("Red "+Thread.currentThread().getPriority());
		         	try {Thread.sleep(1000);} catch(Exception e) {}
		        }
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//Setting Priority of Threads using integers
//		t1.setPriority(1);
//		t2.setPriority(2);
		
		//Setting Priority of Threads using integers
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		//Getting prioritys of Threads
		System.err.println("Thread Priority : "+t1.getPriority());
		System.err.println("Thread Priority : "+t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}