package book7;

import java.util.Scanner;

public class ch7problems {
	
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
	
	public int factorial(int numb) {
		int a = 1; 
		for(int count = 1; count<=numb; count++) {
			a = a*count;
		}
		return a;
	}
	
	public static double squareRoot(double a){

	    double g = a/2;
	    double newg = (g + (a/g))/2;

	    while (Math.abs((g - newg)) > 0.0001){
	        g = newg;
	        newg = (g + (a/g))/2;
	    }
	    return newg;
	}
	
	public double myExp(double x, int n) {
		double nums = x+1;
		int count = 1;
		while(n>=1) {
			nums = nums+(power(x,count+=1))/factorial(count);
			n = n-1;
		}
		return count;
	}

}
