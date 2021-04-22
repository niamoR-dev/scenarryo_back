package fr.ibformation.scenarryoapp.bo;

import java.sql.Blob;
import java.sql.Time;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Movie {
	
	private int id;
	private String title;
	private String producer;
	private Date releaseDate;
	private String ageLimit;
	private Time duration;
	private String text;
	private Blob poster;
	private List<Category> category = new ArrayList<Category>(); 
	private List<Actor> actor = new ArrayList<Actor>();
	
	public Movie(int id, String title, String producer, Date releaseDate, String ageLimit, Time duration, String text,
			Blob poster, List<Category> category, List<Actor> actor) {
		super();
		this.id = id;
		this.title = title;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.ageLimit = ageLimit;
		this.duration = duration;
		this.text = text;
		this.poster = poster;
		this.category = category;
		this.actor = actor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Blob getPoster() {
		return poster;
	}

	public void setPoster(Blob poster) {
		this.poster = poster;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<Actor> getActor() {
		return actor;
	}

	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", producer=" + producer + ", releaseDate=" + releaseDate
				+ ", ageLimit=" + ageLimit + ", duration=" + duration + ", text=" + text + ", poster=" + poster
				+ ", category=" + category + ", actor=" + actor + "]";
	} 

	
	
}
