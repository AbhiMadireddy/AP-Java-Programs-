package book7;

import java.util.Scanner;

public class Problems {
	
	public static void main(String[] args) {
		
		double base;
		int n;
		
		try (var keyboard = new Scanner(System.in)) {
			base = keyboard.nextDouble();
			n = keyboard.nextInt();
		}
		System.out.println(power(base,n));
		
	

	}
	
	public static double power(double base, int n) {
		double b = base;
		while(n>1) {
			base = base * b;
			n--;
		}
		return base;
	}
	
	public static double myExp(int x, int n) {
		
		` num = x+1;
	}

}
