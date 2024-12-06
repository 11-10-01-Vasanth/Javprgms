package project.project;

class Counter {
	synchronized void show(int n) {
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//class Counter1 {
//	public void show() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("T2");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class Threadcls {

	public static void main(String[] args) {
		Counter c = new Counter();
//		Counter1 c1 = new Counter1();


		Thread t1 = new Thread() {
			public void run() {
				c.show(3);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c.show(2);
			}
		};

		t1.start();
		t2.start();

//		System.out.println(c.count);
	}

}
