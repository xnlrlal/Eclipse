package kr.co.ezenac.thread03;

class PriorityThread3 extends Thread {
	int sum = 0;
	int start = 0;
	int end = 100;

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		for (int i = 0; i <= 100; i++) {

			if (i >= start && i <= 50) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	void run2() {

		Thread thread = Thread.currentThread();
		for (int i = 0; i <= 100; i++) {

			if (i > 50 && i <= end) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println(thread.currentThread() + " end");
	}

}

public class JoinTest {

	public static void main(String[] args) {

		PriorityThread3 thread1 = new PriorityThread3();
		thread1.start();

		PriorityThread3 thread2 = new PriorityThread3();
		thread2.run2();
		
		int total = thread1.sum + thread2.sum;
		System.out.println(total);

	}
}
