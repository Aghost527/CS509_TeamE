package dao;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import Flight.Flight;
import Flight.Flights;




public class DaoFlights {
	public static Flights addAll (String xmlFlights) throws NullPointerException {
		Flights flights = new Flights();
		
		// Load the XML string into a DOM tree for ease of processing
		// then iterate over all nodes adding each flight to our collection
		Document docFlights = buildDomDoc (xmlFlights);
		NodeList nodesFlights = docFlights.getElementsByTagName("Flight");
		
		for (int i = 0; i < nodesFlights.getLength(); i++) {
			Element elementFlight = (Element) nodesFlights.item(i);
			Flight flight = buildFlight (elementFlight);
			
//			if (flight.isValid()) {
//				flights.add(flight);
//			}
		}
		
		static private Flight buildFlight (Node nodeFlight) {
			/**
			 * Instantiate an empty Flight object
			 */
			Flight flight = new Flight();

			String name;
			String code;
			double latitude;
			double longitude;
			
			// The flight element has attributes of Name and 3 character flight code
			Element elementFlight = (Element) nodeFlight;
			name = elementFlight.getAttributeNode("Name").getValue();
			code = elementFlight.getAttributeNode("Code").getValue();
			
			// The latitude and longitude are child elements
			Element elementLatLng;
			elementLatLng = (Element)elementFlight.getElementsByTagName("Latitude").item(0);
			latitude = Double.parseDouble(getCharacterDataFromElement(elementLatLng));
			
			elementLatLng = (Element)elementFlight.getElementsByTagName("Longitude").item(0);
			longitude = Double.parseDouble(getCharacterDataFromElement(elementLatLng));

			/**
			 * Update the Flight object with values from XML node
			 */
			flight.name(name);
			flight.code(code);
			flight.latitude(latitude);
			flight.longitude(longitude);
			
			return flight;
		}
		
		return flights;
	}
	
	
	static private Document buildDomDoc (String xmlString) {
		/**
		 * load the xml string into a DOM document and return the Document
		 */
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			InputSource inputSource = new InputSource();
			inputSource.setCharacterStream(new StringReader(xmlString));
			
			return docBuilder.parse(inputSource);
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
			return null;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		catch (SAXException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static String getCharacterDataFromElement (Element e) {
		Node child = e.getFirstChild();
	    if (child instanceof CharacterData) {
	        CharacterData cd = (CharacterData) child;
	        return cd.getData();
	      }
	      return "";
	}
}
