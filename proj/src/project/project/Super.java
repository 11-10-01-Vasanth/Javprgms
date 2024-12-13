package project.project;

import java.util.*;

//class SharedResource {
//	private boolean isDataReady = false;
//	public synchronized void produce() {
//		try {
//			System.out.println("Producing data...");
//			Thread.sleep(1000); // Simulate data production
//			isDataReady = true;
//			System.out.println("Data produced. Notifying consumer...");
//			notify(); // NotFify the waiting thread (consumer)
//		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//			System.out.println("Producer interrupted.");
//		}
//	}
//	public synchronized void consume() {
//		try {
//			while (!isDataReady) {
//				System.out.println("Data not ready. Consumer waiting...");
//				wait(); // Wait until notified by the producer
//			}
//			System.out.println("Data consumed.");
//		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//			System.out.println("Consumer interrupted.");
//		}
//	}
//}
//
//public class Super {
//	public static void main(String[] args) {
//		SharedResource resource = new SharedResource();
//		Thread producer = new Thread(() -> resource.produce());
//		Thread consumer = new Thread(resource::consume);
//		consumer.start(); // Start consumer thread first
//		producer.start(); // Start producer thread
//	}
//}

class G {
	List<Integer> l = new ArrayList<>();
	public void show()
	{
		
	}
}

public class Super {

	public static void main(String[] args) {
		G g = new G();
		
		
	}
}
