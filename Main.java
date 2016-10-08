import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the max number to check.");
		int maxNum = scan.nextInt();
		
		// Check all values between 2 and maxNum
		for (int i = 2 ; i <= maxNum ; i++) {
			// Iterate through all numbers less than i. If we find a number that evenly
			// divides i, add it to a list of factors.
			for (int div = 1 ; div < i ; div++) {
				if (i % div == 0) {
					list.add(div);
				}
			}
			
			// Sum all of the factors.
			int sum = 0;
			for (Integer factor : list) {
				sum += factor;
			}
			
			// If the sum of all the factors equals the number, we know we have a perfect number.
			if (sum == i) {
				System.out.println("Perfect Number Found: " + i);
			}
			
			// Clear the list of factors before we start checking the next number.
			list.clear();
		}
		
		System.out.println("Calculation Complete.");
	}
}
