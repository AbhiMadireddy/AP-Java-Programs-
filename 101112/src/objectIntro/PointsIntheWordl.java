package objectIntro;

public class PointsIntheWordl {
	
	
	public static void main(String[] args) {
		Point bob = new Point(); 
		Point joe = new Point(2,3);
		double d = bob.distance(joe); 
		System.out.println(joe);
		joe.flip();
		System.out.println(joe);
		System.out.println(d);
	
	}

	
	
}
