package kr.co.ezenac.thread01;

/**
 * 
 *  여러 개의 스레드 동시 실행
 *    - 20 미만 짝수 출력
 *    - 10 미만 수 출력
 *    
 */
public class MultiThreadTest {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			
			int eNum = 0;
			for (int i=0; i < 20; i++) {
				eNum++;
				if(eNum%2 == 0) {
					System.out.print(eNum+" ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				} else {
					continue;
				}
			}
			String name1 = Thread.currentThread().getName();
		};
		
		Runnable task2 = () -> {
			
			int tNum = 0;
			for (int i=0; i<10; i++) {
				tNum++;
				System.out.print("("+tNum+")");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		};
		
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Thread thread2 = new Thread(task2);
		thread2.start();
		
	}
}
