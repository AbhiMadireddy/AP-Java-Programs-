package harrypotter;

public class Wizard {
	
	private String name; 
	private int bloodStatus; 
	private int year; 
	private String house; 
	private String job; 
	private String pet; 
	
	public Wizard(){
		this.name = "Harry";
		this.bloodStatus = 1; 
	}
	
	public Wizard(String n, int b) {
		this.name = n; 
		this.bloodStatus = b; 
		this.house = sortingHat();
		this.job = ""; 
		this.pet = ""; 
	}
	
	private String sortingHat() {
		String[] houses = {"Griffindore", "Ravenclaw", "Slytherin", "Hufflepuff"}; 
		int r = (int)(Math.random()*4);
		this.setYear(1);
		return houses[r]; 
	}
	
	public void setYear(int a) {
		this.year = a; 
		this.job = "Student"; 
	}
	public void setPet() {
		this.pet = "p"; 
	}
	
	public String toString() {
		return this.name+" "+this.bloodStatus+" "+this.year+" "+this.house+" "+this.job+" "+this.pet;  
	}

}
