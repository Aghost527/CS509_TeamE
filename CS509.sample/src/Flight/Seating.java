package Flight;



public class Seating {

	
	
	private String firstclassPrice;
	private String coachPrice;
	private int firstclassRemaining;
	private int coachRemaining;
	/**
	 * @param firstclassPrce
	 * @param coachPrice
	 * @param firstclassRemaining
	 * @param coachRemaining
	 */
	public Seating(String firstclassPrce, String coachPrice, int firstclassRemaining, int coachRemaining) {
		super();
		this.firstclassPrce = firstclassPrce;
		this.coachPrice = coachPrice;
		this.firstclassRemaining = firstclassRemaining;
		this.coachRemaining = coachRemaining;
	}
	public String getFirstclassPrce() {
		return firstclassPrce;
	}
	public void setFirstclassPrce(String firstclassPrce) {
		this.firstclassPrce = firstclassPrce;
	}
	public String getCoachPrice() {
		return coachPrice;
	}
	public void setCoachPrice(String coachPrice) {
		this.coachPrice = coachPrice;
	}
	public int getFirstclassRemaining() {
		return firstclassRemaining;
	}
	public void setFirstclassRemaining(int firstclassRemaining) {
		this.firstclassRemaining = firstclassRemaining;
	}
	public int getCoachRemaining() {
		return coachRemaining;
	}
	public void setCoachRemaining(int coachRemaining) {
		this.coachRemaining = coachRemaining;
	}
	
	
	
}
