package array2d;

public class Intro {
	
	
	public static void main(String[] args) {
		
		int[][] nums = new int[8][4];   //first number is rows, second number is columns 
		for(int rows = 0; rows<nums.length; rows++) {
			for(int col = 0; col<nums[0].length; col++) {
				int r = (int)(Math.random()*100+1);
				nums[rows][col] = r; 
			}
			
		}
		
		print(nums);
		
		System.out.println(findMax(nums));
	
	}
	
	public static void print(int[][] nums) {
		for(int rows = 0; rows<nums.length; rows++) {
			for(int col = 0; col<nums[rows].length; col++){
				System.out.println(nums[rows][col]); 
			}
		}
	}
	
	public static int findMax(int[][] nums) {
		
		int max = nums[0][0];
		for(int rows = 0; rows<nums.length; rows++) {
			for(int col = 0; col<nums[rows].length; col++) {
				if(nums[rows][col] > max) {
					max = nums[rows][col];
				}
			}
		}
		
		return max; 
	}
	
	public static int[] rowSums(int[][] nums) {
		
		int[] sums = new int[8]; 
		
		for(int i = 0; i<8; i++) {
			
		}
		
		
		
		
		return sums; 
	}

}
