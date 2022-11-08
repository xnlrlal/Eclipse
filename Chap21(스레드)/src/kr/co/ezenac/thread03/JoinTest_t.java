package kr.co.ezenac.thread03;

/*
 * 	  1부터 50, 51부터 100까지의 합을 구하는 두 개의 Thread를 만들어 그 결과를 출력하시오.
 */

public class JoinTest_t extends Thread {

	int start;
	int end;
	int total;

	public JoinTest_t(int start, int end) {
		// super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		int i;
		for (i = start; i <= end; i++) {
			total += i;
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");

		JoinTest_t jt1 = new JoinTest_t(1, 50);
		JoinTest_t jt2 = new JoinTest_t(51, 100);

		jt1.start();
		jt2.start();

		try {
			jt1.join(); // main 스레드는 not running 상태로 됨
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int sum = jt1.total + jt2.total; // 이 시점에서 jt1과 jt2는 수행이 끝나지 않은 상태임

		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);

		System.out.println("sum = " + sum);

		System.out.println(Thread.currentThread() + " end");

//		sum = jt1.total + jt2.total;
//		System.out.println("sum = " + sum);
	}
}
