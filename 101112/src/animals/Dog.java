package animals;

public class Dog {
	
	
	//variables and fields
	
	
	private String breed; 
	private int age; 
	private String gender;
	private String name; 
	
	
	
	
	
	//constructors
	
	
	public Dog(String b, int a, String g, String n) {
		this.breed = b;
		this.age = a;
		this.gender = g; 
		this.name = n; 
	}
	

		
		
		
		
		
	//object methods 
	
	public void birthday() {
		this.age++; 
	}
	
	public String toString(){
		
		return this.name+" is a "+this.gender + " " + this.breed;
		
	}
	
	public String bark() {
		return "woof woof "; 
	}
	
	public String bark(String s) {
		return s + " " + s + " " + s;
	}
	
	
		
		
		
		
		
	//getter 
	
	public int getAge() {
		return this.age; 
	}
	
	public String getBreed() {
		return this.gender;
	}
	
	public String getName() {
		return this.name; 
	}
	
	public String getGender() {
		return this.gender; 
	}
	
	//setter
	
	public void setAge(int x) {
		this.age = this.age + x; 
	}
	
	public void setGender() {
		this.gender = "fixed"; 
	}
	
	
	
	
	
}
