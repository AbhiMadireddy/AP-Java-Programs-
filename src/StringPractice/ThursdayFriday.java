package StringPractice;

public class ThursdayFriday {
	
	public static int wordScore(String s) {
		
		int sum = 0;
		
		
		
		for(int i = 0, temp; i<s.length(); i++) {
			temp = s.charAt(i);
			sum = sum+temp;
		}
		
		return sum; 
		
		
	}
	
	public static String largestWordScore(String[] words) {
		
		
	}
	
	public static String shortest(String[] words) {
		String shortWord = words[0];;
		
		for(String word : words) {
			if(shortWord.length()>words.length) {
				shortWord = word; 
			}
		}
		
		return shortWord; 
	}
	
	public static void main(String[] args) {
		String[] words = {"hello", "its", "me", "My", "little", "love" , "I", "see",  "your", "eyes", "widen", "like" ,"an", "ocean","when","you" ,"look" ,"at" ,"me" ,"so","full", "of","my", "emotions"};
	}

}
