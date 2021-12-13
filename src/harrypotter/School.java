package harrypotter;
import java.util.ArrayList; 

public class School {
	
	private ArrayList<Wizard> Hogwarts; 
	
	public School() {
		ArrayList<Wizard> hogwarts = new ArrayList<>(); 
	}
	
	public void add(Wizard w) {
		Hogwarts.add(w); 
	}

}
 