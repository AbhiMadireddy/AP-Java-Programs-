package Booster;

public class Fish {

	

	private int time; 

	

	public Fish(int T) {

		this.time = T; 

	}

	

	

	public void tick() {

		this.time--; 

	}

	

	public void reset() {

		this.time = 6;

	}

	

	public int getTime() {

		return this.time;

	}





}