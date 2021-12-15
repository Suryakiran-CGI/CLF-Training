package Multithreading;

public class ThreadName {

public static void main(String[] args) throws Exception {
		
		Runnable obj1 = () ->
		{
		        for(int i=0;i<5;i++) {
			        System.out.println("Green");
		         	try {Thread.sleep(1000);} catch(Exception e) {}
		        }
		};
		Runnable obj2 = () ->
		{
		        for(int i=0;i<5;i++) {
			        System.out.println("Red");
		         	try {Thread.sleep(1000);} catch(Exception e) {}
		        }
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//Incase of setting name w.r.t Object Thread we have syntax
		/*
		 * Thread t1 = new Thread(obj1,"Thread Name");
		 *           or
		 *  can use setters below
		 */
		
		t1.setName("Core One");//Setting Thread Name
		t2.setName("Core Two");
		
		System.err.println("Thread Name : "+t1.getName());//Getting Thread Name
		System.err.println("Thread Name : "+t2.getName());
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}
