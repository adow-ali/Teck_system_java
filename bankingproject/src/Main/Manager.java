package Main;

public class Manager extends Employee{
      // Inheritance 27
	 // fields
	private String timeCards;
public  Manager(){

}
	public Manager(String firstNme, String lastName, long empl_id, String jobTitle, String timeCards) {
		super(firstNme, lastName, empl_id, jobTitle);
		this.timeCards = timeCards;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}
	
	
}
