package ch8BookProblems;

public class BookProblems {
	
	public static double[] powArray(double[] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		return nums;
	
	}
	
	public static int indexOfMax(int[] nums) {
		int index = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[index]<nums[i]) {
				index = i;
			}
		}
		return index; 
	}
	
	public static boolean[] sieve(int[] nums) {
		boolean[] prime = new boolean[nums.length];
		
		for(int i = 0; i<nums.length; i++) {
			if(i>0) {
				for(int a = 0; a<i; a++) {
					if((nums[a] != 0 && nums[a] != 1) && (nums[i]/nums[a] != 0)){
						prime[i] = true;
					}
				}
			}
		}
		
		return prime;
	}
	
	public static int max(int[] nums) {
		int max = maxInRange(nums, 0, nums.length);
		return max;
	}
	
	public static int maxInRange(int[] nums, int lowIndex, int highIndex) {
		
		if(lowIndex == highIndex) {
			return nums[lowIndex];
		}
		else {
			return Math.max(nums[lowIndex], maxInRange(nums, lowIndex++, highIndex));
		}
	}
		
	
	
	public static boolean areFactors(int[] nums, int n){
		for(int i = 0; i<nums.length; i++) {
			if(n%nums[i]!=0) {
				return false;
			}
		}
		return true; 
	}
	
	public static boolean arePrimeFactors(int[] nums, int n){
		
		for(int i = 0; i<nums.length; i++) {
			if(i>0) {
				for(int a = 0; a<i; a++){
					if((nums[a] != 0 && nums[a] != 1) && nums[i]%nums[a] == 0) {
						return false;
					}
				}
			}
		}
		
		int prod = 1; 
		
		for(int i = 0; i<nums.length; i++) {
			prod = prod*nums[i];
		}
		
		if(prod != n) {
			return false;
		}
		
		return true;
		
	}
	
	

}

	