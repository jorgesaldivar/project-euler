/**
 * 
 * @author Jorge.Saldivar
 *
 *         Problem Description The sequence of triangle numbers is generated by
 *         adding the natural numbers. So the 7th triangle number would be 1 + 2
 *         + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 
 *         1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 *         Let us list the factors of the first seven triangle numbers:
 * 
 *         1: 1 3: 1,3 6: 1,2,3,6 10: 1,2,5,10 15: 1,3,5,15 21: 1,3,7,21 28:
 *         1,2,4,7,14,28 We can see that 28 is the first triangle number to have
 *         over five divisors. What is the value of the first triangle number to
 *         have over five hundred divisors?
 */

public class Problem012 {

	static int getDivisors(long sum) {

		int divisors = 0;
		final long numberToCheck = sum / 2;
		
		for (int i = 1; i <= numberToCheck; i++) {
			if(sum % i == 0) {
				divisors++;
			}
		}

		return divisors;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Looking for Number...");
		int naturalNumber = 1;
		long sum = 0;

		do {

			sum += naturalNumber++;
			
		} while (getDivisors(sum) < 500);
		
		System.out.println("Answer: " + sum);

	}

}
