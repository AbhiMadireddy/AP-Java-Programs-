package Problems;

public class Book {
	
	public boolean isDivisible(int n, int m) {
		
		if(n%m == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isTriangle(int a, int b, int c) {
		
	}
	
	public int oddSum(int n) {
		if(n>0) {
			return n+oddSum(n-2);
		}
		else {
			return n;
		}
	}

}
