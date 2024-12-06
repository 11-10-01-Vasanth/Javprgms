package project.project;

public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable a = () -> {
			// TODO Auto-generated method stub
			for (int i = 0; i < 60; i++) {
				System.out.println("Bcls");
			}
		};
		
		Runnable b = () -> {
			// TODO Auto-generated method stub
			for (int i = 0; i < 60; i++) {
				System.out.println("Ccls");
			}
		};

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();
	}

}
