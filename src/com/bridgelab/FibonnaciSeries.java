package com.bridgelab;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		for (int i = 1; i <= n; ++i) {
			System.out.println(n1);
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;

		}

	}

}
