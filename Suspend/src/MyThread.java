
class MyThread implements Runnable {
	Thread thrd;
	volatile boolean suspended;
	volatile boolean stopped;

	MyThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
	}

	// A factory method that creates and starts a thread.
	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);

		myThrd.thrd.start(); // begin execution of the thread
		return myThrd;
	}

	// This is the entry point for thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}

				// Use synchronized block to check suspended and stopped.
				synchronized (this) {
					while (suspended) {
						wait();
					}
					if (stopped)
						break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}

	// Stop the thread.
	synchronized void mystop() {
		stopped = true;

		// The following lets a suspended thread be stopped.
		suspended = false;
		notify();
	}

	// Suspend the thread.
	synchronized void mysuspend() {
		suspended = true;
	}

	// Resume the thread.
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}