package driver;

import Flight.Flights;
import dao.ServerInterface;

public class DriverManager {
	
	public Flights searchFlightsWithoutStop(String Arrival,String time,String Departure){
		ServerInterface resSys = new ServerInterface();
		Flights flights = resSys.getFlighs("TeamE","BOS","2017_05_10");
//		Flights flights = resSys.getFlighs("TeamE",Departure,time);
		flights.sortByArrivalAirport(flights);
		flights=flights.filterByArrival("RDU", flights);
		return flights;
		
	}
	

	
}
