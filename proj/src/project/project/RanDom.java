package project.project;

import java.util.Random;

public class RanDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		// Generate a random integer
		int randomInt = random.nextInt(); // Any integer value
		System.out.println("Random Integer: " + randomInt);

		// Generate a random integer within a range (0 to 99)
		int randomIntInRange = random.nextInt(100); // Upper bound is exclusive
		System.out.println("Random Integer (0 to 99): " + randomIntInRange);

		// Generate a random double (0.0 to 1.0)
		double randomDouble = random.nextDouble();
		System.out.println("Random Double (0.0 to 1.0): " + randomDouble);

		// Generate a random float (0.0 to 1.0)
		float randomFloat = random.nextFloat();
		System.out.println("Random Float (0.0 to 1.0): " + randomFloat);

		// Generate a random boolean
		boolean randomBoolean = random.nextBoolean();
		System.out.println("Random Boolean: " + randomBoolean);

		// Generate a random long
		long randomLong = random.nextLong();
		System.out.println("Random Long: " + randomLong);

		// Generate a random Gaussian (normal distribution with mean 0 and standard
		// deviation 1)
		double randomGaussian = random.nextGaussian();
		System.out.println("Random Gaussian: " + randomGaussian);
	}

}
