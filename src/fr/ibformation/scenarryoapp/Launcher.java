package fr.ibformation.scenarryoapp;


import fr.ibformation.scenarryoapp.bo.*;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room room1 = new Room(0, 0, 0, 0);
		Category category1 = new Category(0, null);
		Actor actor1 = new Actor(0, null, null);
		FilmShow filmShow1 = new FilmShow(0, 0, 0, null, null, null);
		Movie movie1 = new Movie(0, null, null, null, null, null, null, null, null, null);
		Schedule schedule1 = new Schedule(0, null, null, null);
		
		System.out.println("test");
	}

}
