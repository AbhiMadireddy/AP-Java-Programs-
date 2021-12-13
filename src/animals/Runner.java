package animals;

public class Runner {
	
	public static void main(String[] args) {
		
		Dog clifford = new Dog("Labrador", 2, "Male", "Clifford");
		System.out.println(clifford);
		System.out.println(clifford.getAge());
		clifford.birthday();
		System.out.println(clifford.getAge());
		
		System.out.println(clifford.bark());
		System.out.println(clifford.bark("woooooooof"));
	}
	
	
	
	

}
