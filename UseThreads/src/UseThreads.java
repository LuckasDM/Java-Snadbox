
public class UseThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting."); 
		 
	    // First, construct a MyThread object. 
	    MyThread mt = new MyThread("Child #1"); 
	 
	    // Next, construct a thread from that object. 
	    Thread newThrd = new Thread(mt); 
	 
	    // Finally, start execution of the thread. 
	    newThrd.start(); 
	 
	    do { 
	      System.out.print("."); 
	      try { 
	        Thread.sleep(100); 
	      } 
	      catch(InterruptedException exc) { 
	        System.out.println("Main thread interrupted."); 
	      } 
	    } while (mt.count != 10); 
	 
	    System.out.println("Main thread ending.");

	}

}
