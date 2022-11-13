// Create a thread by implementing Runnable.

public class MyThread implements Runnable {
	int count;
	String thrdName;

	MyThread(String name) {
		count = 0;
		thrdName = name;
	}

	// Entry point of thread.
	public void run() {
		System.out.println(thrdName + " starting.");
		try {
			do {
				Thread.sleep(500);
				System.out.println("In " + thrdName + ", count is " + count);
				count++;
			} while (count < 10);
		} catch (InterruptedException exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}
}
