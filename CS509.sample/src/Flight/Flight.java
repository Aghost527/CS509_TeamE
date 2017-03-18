package Flight;

import Time.Time;
import utils.Saps;

/**
 * This class holds values pertaining to a single Airport. Class member attributes
 * are the same as defined by the CS509 server API and store values after conversion from
 * XML received from the server to Java primitives. Attributes are accessed via getter and 
 * setter methods.
 * 
 * @author blake
 * @version 1.2
 * @since 2016-02-24
 * 
 * 
 *
 */


public class Flight {



	
	/**
	 * Airport attributes as defined by the CS509 server interface XML
	 */
	private String airplane;			// Airplane type as an attribute
	private String number;
	private String arrival;              // Three character code of the Arrival airport
	private String departure;              // Three character code of the Departure airport
	private Time departureTime;
	private Time arrivalTime;
	private Seating seating;
	
	
	
	
	
	/**
	 * @param airplane
	 * @param number
	 * @param arrival
	 * @param departure
	 * @param departureTime
	 * @param arrivalTime
	 * @param seating
	 */
	public Flight(String airplane, String number, String arrival, String departure, Time departureTime,
			Time arrivalTime, Seating seating) {
		super();
		this.airplane = airplane;
		this.number = number;
		this.arrival = arrival;
		this.departure = departure;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.seating = seating;
	}
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the airplane
	 */
	public String getAirplane() {
		return airplane;
	}
	/**
	 * @param airplane the airplane to set
	 */
	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the arrival
	 */
	public String getArrival() {
		return arrival;
	}
	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	/**
	 * @return the departure
	 */
	public String getDeparture() {
		return departure;
	}
	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	/**
	 * @return the departureTime
	 */
	public Time getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arrivalTime
	 */
	public Time getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * @return the seating
	 */
	public Seating getSeating() {
		return seating;
	}
	/**
	 * @param seating the seating to set
	 */
	public void setSeating(Seating seating) {
		this.seating = seating;
	}
	
	


}
