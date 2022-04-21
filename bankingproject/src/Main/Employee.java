package Main;
       
public class Employee {
	// Fields Java classes slide 14
    private  String firstNme;
    private String lastName;
    private  long empl_id;
    private  String jobTitle;
    
    public Employee(){
    }
	public Employee(String firstNme, String lastName, long empl_id, String jobTitle) {
		super();
		this.firstNme = firstNme;
		this.lastName = lastName;
		this.empl_id = empl_id;
		this.jobTitle = jobTitle;
	}
	public String getFirstNme() {
		return firstNme;
	}
	public void setFirstNme(String firstNme) {
		this.firstNme = firstNme;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getEmpl_id() {
		return empl_id;
	}
	public void setEmpl_id(long empl_id) {
		this.empl_id = empl_id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
		
		// other methods
		
	}
	@Override
	public String toString() {
		return "Employee ["
				+ "firstName=" + firstNme + ","
				+ " lastName=" + lastName 
				+ ", empl_id=" + empl_id 
				+ ", jobTitle="+ jobTitle + "]";
	}

	}
	
	
	
	
	
	
      

