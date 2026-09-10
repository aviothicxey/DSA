package java;

import java.util.Scanner;
/**
Write a Java program that demonstrates Multithreading with a shared accumulator. 
Given an integer N, split the computation of the sum of squares of all integers from 1 to N across exactly 
4 threads (thread i handles numbers i+1, i+5, i+9, ... for i = 0..3). Each thread computes its partial sum 
and adds it to a shared total using a synchronized method. After all threads finish (using join), print the total.

Input Format
The input consists of a single integer N.

Output Format
Print the sum of squares of all integers from 1 to N in the format:
Sum of Squares: value

Code Constraints
1 ≤ N ≤ 1000
 */
public class practice {
	private static class SharedAccumulator {
		private long total;

		public synchronized void add(long value) {
			total += value;
		}

		public long getTotal() {
			return total;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		SharedAccumulator accumulator = new SharedAccumulator();
		Thread[] threads = new Thread[4];

		for (int i = 0; i < 4; i++) {
			final int threadIndex = i;
			threads[i] = new Thread(() -> {
				long partialSum = 0;
				for (int number = threadIndex + 1; number <= n; number += 4) {
					partialSum += (long) number * number;
				}
				accumulator.add(partialSum);
			});
			threads[i].start();
		}

		for (Thread thread : threads) {
			thread.join();
		}

		System.out.println("Sum of Squares: " + accumulator.getTotal());
        scanner.close();
	}
}
