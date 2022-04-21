package Main;

public class Manager extends Employee implements AccountActionsIMPL{
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
	@Override
	public void withdraw(float amount, float withdrawAmount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit(float amount, float depositAmount) {
		// TODO Auto-generated method stub
		
	}
	
	public void PrintThis(int...val) {
	}
}
