/**
 * 
 */
package driver;
import java.util.Scanner;

import Flight.Flight;
import Flight.Flights;
import airport.Airport;
import airport.Airports;
import dao.ServerInterface;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServerInterface resSys = new ServerInterface();
//		if (args.length != 1) {
//			System.err.println("usage: CS509.sample teamName");
//			System.exit(-1);
//			return;
//		}
		
//		String teamName = "TeamE";
//		// Try to get a list of airports
//		Airports airports = resSys.getAirports(teamName);
//		for (Airport airport : airports) {
//			System.out.println(airport.toString());
//		}
		Scanner s = new Scanner(System.in);
		String teamName = "TeamE";
		// Try to get a list of airports
		while(true){
		
		System.out.println("departAirportCode:");
		
	    String code = s.nextLine();
		System.out.println("departTime (YYYY_MM_DD):");
		String time = s.nextLine();
		Flights flights = resSys.getFlighs(teamName,code,time);
		
		for (Flight flight : flights) {
			System.out.println(flight.toString());
		}
		}
	}
}
