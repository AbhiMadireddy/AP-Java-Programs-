package Jobs;

public class Employee {
	
	//names, positition, salary, isCurrent 
	
	private String name;
	
	
	private double salary; 
	
	
	private String position; 
	
	private boolean isCurrent; 
	

	
	
	public Employee(String n, double s, String p) {
		this.name = n;
		this.salary = s; 
		this.position = p; 
	}
	
	public String toString() {
		return this.name + " " + this.salary + " " + this.position; 
	}
	
	public void getPromoted(String a, double b) {
		this.position = a; 
		this.salary += b; 
	}
	
	public String comparePosition(Employee other) {
		if(this.position.length() > other.position.length()) {
			return this.name+" is higher up in the company than "+other.name;
		}else if(this.position.length() < other.position.length()) {
			return other.name+" is higher up in the company than "+this.name; 
		}
		return compareSalary(other);
	}
	
	public String compareSalary(Employee other) {
		
		if(this.salary > other.salary) {
			return this.name+" is paid higher than "+other.name+" despite being in the same position.";
		}else if(this.salary < other.salary) {
			return other.name+" is paid higher than "+this.name+" depsite being in the same position.";
		}
		return "Both earn the same amount of money and work in the same position.";
	}
	
	public void getFired() {
		this.position = "N/A";
		this.salary = 0; 
		this.isCurrent = false; 
	}
	
	public void moreMoney(double percent) {     //percent entered in decimal form
		this.salary *= 100+percent; 
	}
	
	
	
	

	
	//getPromoted (String newJobTitle, salaryIncrease)
	
	
	
	
	//getFired()
	
	
	
	//moreMoney(double percentIncrease)
 	

}
