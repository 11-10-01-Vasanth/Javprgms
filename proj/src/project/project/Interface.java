package project.project;

interface Heli {
	public void start();
}

interface Heli1 {
	public void start1();
}

class Hcar implements Heli, Heli1 {
	public void start() {
		System.out.println("Start");
	}

	@Override
	public void start1() {
		System.out.println("Start1");

	}
}

public class Interface {

	public static void main(String[] args) {
		Hcar h = new Hcar();
		h.start();
		h.start1();
	}

}
