package objectIntro;

public class Point {
	// fields for point
	private int x;
	private int y; 
	// constructors
	public Point() {
		this.x = 0;
		this.y = 0;
		
	}
	public Point(int a, int b) {
		this.x = a;
		this.y = b; 
		
	}
	
	public double distance(Point other) {
		
		double a = Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2);
		return Math.sqrt(a);
		
	}
	
	
	public void move(int a, int b) {
		
		this.x = a; 
		this.y = b; 
	}
	
	public String toString() {
		return "("+this.x +"," + this.y+ ")";
	}
	public void flip() {
		int temp = this.x;
		this.x = this.y;
		this.y = temp; 
		
		
		
	}

}
