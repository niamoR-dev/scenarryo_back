package fr.ibformation.scheduling.bo;

;

public class Schedule {

	private int id;
	private String movieName;
	private String filmShowDate;
	private int startingHour;
	private int endingHour;
	
	
		
	public Schedule(int id, String movieName, String filmShowDate, int startingHour, int endingHour) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.filmShowDate = filmShowDate;
		this.startingHour = startingHour;
		this.endingHour = endingHour;
	}



	public Schedule(Schedule schedule) {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public String getFilmShowDate() {
		return filmShowDate;
	}



	public void setFilmShowDate(String filmShowDate) {
		this.filmShowDate = filmShowDate;
	}



	public int getStartingHour() {
		return startingHour;
	}



	public void setStartingHour(int startingHour) {
		this.startingHour = startingHour;
	}



	public int getEndingHour() {
		return endingHour;
	}



	public void setEndingHour(int endingHour) {
		this.endingHour = endingHour;
	}



	@Override
	public String toString() {
		return movieName + "        " + filmShowDate + "        "	+ startingHour + "        " + endingHour;
	}

	

}
