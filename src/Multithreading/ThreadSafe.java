package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Countr{
	//Using Atomic Wrapper Class
	AtomicInteger count = new AtomicInteger();
	
	public void increment() {
		count.incrementAndGet();
	}
}


public class ThreadSafe {

	public static void main(String[] args) throws Exception {
		
		Countr c = new Countr();
		
		Thread t1 = new Thread(new Runnable() 
		{
			public void run() {
				
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() 
		{
			public void run() {
				
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count is : "+c.count);
	}

}
