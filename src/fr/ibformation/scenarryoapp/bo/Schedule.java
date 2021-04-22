package fr.ibformation.scenarryoapp.bo;

import java.sql.Date;
import java.sql.Time;

public class Schedule {

	private int id;
	private Date filmShowDate;
	private Time startingHour;
	private Time endingHour;
	
	
	public Schedule(int id, Date filmShowDate, Time startingHour, Time endingHour) {
		super();
		this.id = id;
		this.filmShowDate = filmShowDate;
		this.startingHour = startingHour;
		this.endingHour = endingHour;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getFilmShowDate() {
		return filmShowDate;
	}


	public void setFilmShowDate(Date filmShowDate) {
		this.filmShowDate = filmShowDate;
	}


	public Time getStartingHour() {
		return startingHour;
	}


	public void setStartingHour(Time startingHour) {
		this.startingHour = startingHour;
	}


	public Time getEndingHour() {
		return endingHour;
	}


	public void setEndingHour(Time endingHour) {
		this.endingHour = endingHour;
	}


	@Override
	public String toString() {
		return "Schedule [id=" + id + ", filmShowDate=" + filmShowDate + ", startingHour=" + startingHour
				+ ", endingHour=" + endingHour + "]";
	}
	
	
	
}
