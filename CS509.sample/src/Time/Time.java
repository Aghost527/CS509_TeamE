package Time;

public class Time {
	 
	private int year;
	private String month;
	private int day;
	private String clock;
	private String timeZone;
	
	
	Time( int year, String month,int day, String clock,String timeZone){

		this.year=year;
		this.month=month;
		this.day=day;
		this.clock=clock;
		this.timeZone=timeZone;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getClock() {
		return clock;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	} 
	
	
}
