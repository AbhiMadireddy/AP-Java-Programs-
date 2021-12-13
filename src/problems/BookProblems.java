package problems;

import java.math.BigInteger;

public class BookProblems {
	
	
	public static BigInteger facotrial(BigInteger a) {
		if(a == BigInteger.valueOf(0)) {
			return BigInteger.valueOf(1);
		
		}else {
			return a.multiply(facotrial(a.subtract(BigInteger.valueOf(1))));
		}
	}
	
	public static void main(String[] args) {
		BigInteger num = BigInteger.valueOf(30);
		System.out.println(facotrial(num));
	}
	
	
	}



