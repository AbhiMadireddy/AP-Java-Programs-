package Jobs;

public class Runner {
	
	
	public static void main(String[] args) {
		String n1 = "Joe";
		double joeS = 1564346.45; 
		String joeP = "Chief Executive Officer";
		
		Employee Joe = new Employee(n1, joeS, joeP);
		System.out.println(Joe.toString());
		
		String n2 = "Lucas";
		double lS = 98000.00;
		String lP = "Worker";
		
		Employee Lucas = new Employee(n2, lS, lP);
		
		System.out.println(Lucas.toString());
		
		System.out.println(Joe.comparePosition(Lucas));

	}
	
}
