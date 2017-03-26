package driver;

import java.util.ArrayList;
import java.util.List;

import Flight.Flights;
import dao.ServerInterface;

public class DriverManager {
	
	public Flights searchFlightsWithoutStop(String Arrival,String time,String Departure){
		ServerInterface resSys = new ServerInterface();
		Flights flights = resSys.getFlighs("TeamE","BOS","2017_05_10",true);
//		Flights flights = resSys.getFlighs("TeamE",Departure,time);
		flights.sortByArrivalAirport();
		flights=flights.filterByArrival("RDU", flights);
		return flights;
		
	}
	/*
	 * for the time being, it can only search flight within one day
	 */
	public List<Flights> searchFlightsWithOneStop(String Arrival,String time,String Departure){
		ServerInterface resSys = new ServerInterface();
		List<Flights> res=new ArrayList<Flights>();
//		Flights flights1 = resSys.getFlighs("TeamE","BOS","2017_05_10",true);
		Flights flights1 = resSys.getFlighs("TeamE",Departure,time,true);//true means search by departure
		flights1.sortByArrivalAirport();

		Flights flights2 = resSys.getFlighs("TeamE",Arrival,time,false);
		flights2.sortByArrivalAirport();
		
		for(Flight f1 : flights1){}
		
//		Flights flights2 =
		
		return res;
		
	}
	
}
