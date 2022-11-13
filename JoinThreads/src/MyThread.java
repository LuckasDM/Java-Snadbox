
class MyThread implements Runnable { 
	int count; 
	Thread thrd; 
	
	// Construct a new thread. 
	MyThread(String name) { 
		thrd = new Thread(this, name); 
		count = 0; 
		thrd.start(); // start the thread 
	} 
	
	// Begin execution of new thread. 
	public void run() { 
		System.out.println(thrd.getName() + " starting."); 
		try {  
			do { 
				Thread.sleep(500); 
				System.out.println("In " + thrd.getName() + 
						", count is " + count); 
				count++; 
			} while(count < 10); 
		} 
		catch(InterruptedException exc) { 
			System.out.println(thrd.getName() + " interrupted."); 
		} 
		System.out.println(thrd.getName() + " terminating."); 
	} 
}
