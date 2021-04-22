package fr.ibformation.scenarryoapp.bo;

public class Room {
	
	private int id;
	private int room;
	private int roomNumber;
	private int seatsQuantity;
	
	
	public Room(int id, int room, int roomNumber, int seatsQuantity) {
		super();
		this.id = id;
		this.room = room;
		this.roomNumber = roomNumber;
		this.seatsQuantity = seatsQuantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public int getSeatsQuantity() {
		return seatsQuantity;
	}


	public void setSeatsQuantity(int seatsQuantity) {
		this.seatsQuantity = seatsQuantity;
	}


	@Override
	public String toString() {
		return "Room [id=" + id + ", room=" + room + ", roomNumber=" + roomNumber + ", seatsQuantity=" + seatsQuantity
				+ "]";
	}
	
	
	
}
