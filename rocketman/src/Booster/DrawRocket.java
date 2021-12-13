

package Booster;

public class DrawRocket {
	
	/* ROCKET_SIZE is a class constant which represents width of output rocket
	 *  Changing this constant results in the output rocket being either wider or narrower. 
	 *  Height remains the same.  
	 */
	
	public static int ROCKET_SIZE = 8;          
	
	public static void main(String[] args) {
		noseBooster();
		dividerSymbols();
		halfBody();
		halfBody2();
		dividerSymbols();
		halfBody2();
		halfBody();
		dividerSymbols();
		noseBooster();
	}
	
	/*
	 * This method prints the nose and booster sections of the rocket. 
	 * 			     /**\     
	 * 				//**\\    
	 * 			   ///**\\\   
	 *            ////**\\\\   
	 *           /////**\\\\\
	 */
	
	public static void noseBooster() {             
		
		/*
		 * Variables inside for loops do not have meaningful names as they are just counters
		 */
		for(int r = 0; r<ROCKET_SIZE*2-1; r++) {      
			
			for(int c = ROCKET_SIZE*2-1; c>r; c--) {   
				System.out.print(" ");
			}
			for(int s = 0; s<=r; s++) {
				System.out.print("/");
			}
			System.out.print("**");
			for(int s = 0; s<=r; s++) {
				System.out.print("\\");
			}
			for(int c = ROCKET_SIZE*2-1; c>r; c--) {    
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * This method prints the divider portion of the rocket, 
	 * which is comprised of two '+" and mostly of "=*"
	 * 
	 * 			+=*=*=*=*=*=*+
	 */
	
	public static void dividerSymbols() {          
		String equalTimes = "=*";
		System.out.print("+");
		for(int p = 0; p<ROCKET_SIZE*2; p++) {       
			System.out.print(equalTimes);
		}
		System.out.println("+");
	}
	
	/*
	 * This method prints the top part of the first body segment and the
	 *  bottom half of the second body segment. 
	 *  
	 *  			|../\..../\..|
					|./\/\../\/\.|
					|/\/\/\/\/\/\|
	 */
	public static void halfBody() {        
		String hut = "/\\";
		String dot = ".";
		
		for(int r = 0; r<ROCKET_SIZE; r++) {         
			System.out.print("|");
			
			for(int d = ROCKET_SIZE-1; d>r; d--) {     
				System.out.print(dot);
			}
			for(int h = 0; h<=r; h++) {
				System.out.print(hut);
			}
			for(int d = ROCKET_SIZE-1; d>r; d--) {   
				System.out.print(dot);
			} 
			for(int d = ROCKET_SIZE-1; d>r; d--) {   
				System.out.print(dot);
			}
			for(int h = 0; h<=r; h++) {
				System.out.print(hut);
			}
			for(int d = ROCKET_SIZE-1; d>r; d--) {  
				System.out.print(dot);
			}
			System.out.println("|");
		}
	}
	/*
	 * This method prints the bottom half of the 
	 * first body segment and the top half of the second body segment 
	 * 
	 * 			|\/\/\/\/\/\/|
	 * 			|.\/\/..\/\/.|	
	 * 			|..\/....\/..|
	 * 
	 */
	public static void halfBody2() {          
		String hut = "\\/";
		String dot = ".";
		for(int r = 0; r<ROCKET_SIZE; r++) {        
			System.out.print("|");
			for(int d = 0; d<r; d++) {
				System.out.print(dot);
			}
			
			for(int h = ROCKET_SIZE; h>r; h--) {   
				System.out.print(hut);
			}
			for(int d = 0; d<r; d++) {                          
				System.out.print(dot);
			}
			for(int d = 0; d<r; d++) {
				System.out.print(dot);
			}
			for(int h = ROCKET_SIZE; h>r; h--) {    
				System.out.print(hut);
			}
			for(int d = 0; d<r; d++) {
				System.out.print(dot);
			}
			
			System.out.println("|");
		}
	}
}

