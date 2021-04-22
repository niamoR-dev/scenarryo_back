package fr.ibformation.scenarryoapp.bo;

import java.util.ArrayList;
import java.util.List;

public class FilmShow {
	
	private int id;
	private int priceTicket;
	private int bookedSeats;
	private List<Room> room = new ArrayList<Room>(); 
	private List<Movie> movie = new ArrayList<Movie>(); 
	private List<Schedule> schedule = new ArrayList<Schedule>();
	
	
	public FilmShow(int id, int priceTicket, int bookedSeats, List<Room> room, List<Movie> movie,
			List<Schedule> schedule) {
		super();
		this.id = id;
		this.priceTicket = priceTicket;
		this.bookedSeats = bookedSeats;
		this.room = room;
		this.movie = movie;
		this.schedule = schedule;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPriceTicket() {
		return priceTicket;
	}


	public void setPriceTicket(int priceTicket) {
		this.priceTicket = priceTicket;
	}


	public int getBookedSeats() {
		return bookedSeats;
	}


	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}


	public List<Room> getRoom() {
		return room;
	}


	public void setRoom(List<Room> room) {
		this.room = room;
	}


	public List<Movie> getMovie() {
		return movie;
	}


	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}


	public List<Schedule> getSchedule() {
		return schedule;
	}


	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}


	@Override
	public String toString() {
		return "FilmShow [id=" + id + ", priceTicket=" + priceTicket + ", bookedSeats=" + bookedSeats + ", room=" + room
				+ ", movie=" + movie + ", schedule=" + schedule + "]";
	} 
	
	
	
	
	

}
