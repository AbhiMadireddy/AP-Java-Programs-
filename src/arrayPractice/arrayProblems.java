package arrayPractice;

public class arrayProblems {
	
	
	
	public static void printMe(int[] nums) {
		
		for(int i = 0; i<nums.length; i++) {
			
			System.out.print(nums[1]+", ");
		}
	}
	
	
	public static int[] fillArray(int n) {
		
		int[] rando= new int[n];
		for(int count = 0; count<rando.length; count++) {
			
			rando[count]= (int)(Math.random() * 100 + 1);
				
		}
		return rando;
		
	}
	
	public static void main(String[] args) {
		
		int nums[] = fillArray(10);
		System.out.println(nums);
		
		printMe(nums);
		System.out.println(findMax(nums));
		System.out.println(findMin(nums));
 	}
	
	public static int findMax(int[] nums) {
		
		int max = nums[0]; 
		for(int i = 0; i<nums.length; i++) {
			
			max = Math.max(nums[1], max);
			
		}
		return max; 
		
	}
	
	public static int findMin(int[] nums) {
		
		int min = nums[0];
		for(int i = 0; i<nums.length; i++) {
			
			min = Math.min(nums[i], min);
			
		}
		return min;
		
	}
	
	
	public static int maxIndex(int[] nums) {
		int numb = 0;
		int maximum = nums[0];
		for(int i = 0; i<nums.length; i++) {
			
			if(maximum<nums[i]) {
				numb = i;
			}
			
		}
		return numb; 
	}

}
