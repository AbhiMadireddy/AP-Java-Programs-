package ch9BookProblems;

public class BookStuff {
	
	
	public static void main(String[] args) {
		String check = "Hello I am Abhi";
		String palindrome = "ObbO";
		String a = "tom morvolo riddle";
		String b = "i am lord voldermort";
		System.out.println(letterHist(check));
		System.out.println(isPalindrome(palindrome));
		System.out.println(isAbecedarian(palindrome));
		System.out.println(isDoubloon(palindrome));
		System.out.println(isAnagram(a,b));
		System.out.println(checkSpell(a,b));
	}
	
	
	public static int[] letterHist(String a) {
		int[] hist = new int[26];
		
		for(int i = 0; i<a.length(); i++) {
			char temp = a.charAt(i);
			if(temp >= 'a' && temp <= 'b') {
				hist[temp-'a']++;
			}
		}
		return hist; 
	}
	
	

	/**
 	* Returns the first character of the given String.
 	*/
	
	public static char first(String s) {
    	return s.charAt(0);
	}
	/**
 	* Returns all but the first letter of the given String.
 	*/
	
	public static String rest(String s) {
    	return s.substring(1);
	}
	
	public static char last(String s) {
		return s.charAt(s.length() - 1); 
	}
	
	/**
 	* Returns all but the first and last letter of the String.
 	*/
	
	public static String middle(String s) {
    	return s.substring(1, s.length() - 1);
	}
	/**
 	* Returns the length of the given String.
 	*/
	
	public static int length(String s) {
		return s.length();
	}
	
	public static boolean isPalindrome(String s) {
		
		if(s.length() > 1) {
			if(first(s) != last(s)) {
				return false;
			}else{
				return isPalindrome(middle(s));
			}
		}
		return true;
		
	}
	
	public static boolean isAbecedarian(String word) {
		
		
		for(int i = 0; i<word.length()-1; i++) {
			if(word.charAt(i) > word.charAt(i+1)) {
				return false;
			}
	
		}
		return true;
	}
	
	public static boolean isDoubloon(String word) {
		
		int[] check = new int[26]; 
		
		for(int i = 0; i<word.length()-1; i++) {
			char temp = word.charAt(i);
			if('a' <= temp && temp <= 'z') {
				check[temp-'a']++;
			}
		}
		for(int i = 0; i<26; i++) {
			if(check[i] != 0 && check[i] != 2) {
				return false; 
			}
		}
		return true;
		
	}
	
	public static boolean isAnagram(String a, String b) {
		
		int[] a1 = new int[26];
		int[] b1 = new int[26];
		
		for(int i = 0; i< a.length(); i++) {
			char temp = a.charAt(i);
			if('a' <= temp && temp <= 'z') {
				a1[temp-'a']++;
			}
		}
		for(int i = 0; i< b.length(); i++) {
			char temp = b.charAt(i);
			if('a' <= temp && temp <= 'z') {
				b1[temp-'a']++;
			}
		}
		for(int i = 0; i<26; i++) {
			if(a1[i] != b1[i]) {
				return false; 
			}
		}
		return true;
		
	}
	
	public static boolean checkSpell(String a, String b) {
		
		int[] a1 = new int[26];
		int[] b1 = new int[26];
		
		for(int i = 0; i<a.length(); i++) {
			char temp = b.charAt(i);
			if(temp >= 'a' && temp <= 'z') {
				a1[temp - 'a']++;
			}
		}
		for(int i = 0; i<b.length(); i++) {
			char temp = b.charAt(i);
			if(temp >= 'a' && temp <= 'z') {
				b1[temp-'a']++;
			}
		}
		for(int i = 0; i<26; i++) {
			if(a1[i]-b1[i]<0) {
				return false;
			}
		}
		return true; 
		
	}

}
