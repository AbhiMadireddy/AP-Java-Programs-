package Booster;

import java.util.ArrayList; 



public class Runner {

	

	public static void main(String[] args) {

		ArrayList<Fish> lamp = new ArrayList<>(); 

		lamp.add(new Fish(6)); 

		for( int i = 0; i < 80; i++ ) {

			lamp = day(lamp);

		}

	

		print(lamp);

	}

	

	public static ArrayList<Fish> day(ArrayList<Fish> lamp){

		int temp = lamp.size(); 

		for(int i = 0; i<temp; i++) {

			lamp.get(i).tick(); 

			if(lamp.get(i).getTime() <= 0) {

				lamp.add(i+1, new Fish(8));

				lamp.get(i).reset(); 

			}

		}

		return lamp; 

	}

	public static void print(ArrayList<Fish> lamp) {

		String s = lamp.get(0).getTime() + "";

		for(int i = 1; i<lamp.size(); i++) {

			s+=", " + lamp.get(i).getTime();

		}

		System.out.print(lamp.size());

	}

	



}

