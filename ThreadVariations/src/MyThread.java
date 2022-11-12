// My Thread variations. This version of MyThread
// creates a Thread when its constructor is called and
// stores it in an instance variable called thrd.
// It also sets the name of the thread and provides
// a factory method to create and start a thread.

public class MyThread implements Runnable {
	Thread thrd;
	
	//Construct a new thread using this Runnable and give it a name.
	MyThread(String name) {
		thrd = new Thread(this, name);
	}
	
	// A factory method that creates and starts a thread.
	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);
		
		myThrd.thrd.start(); //begin execution of the thread
		return myThrd;
	}
	
	//Entry point of thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int count=0; count<10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ",count is " + count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}
