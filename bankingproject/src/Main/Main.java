package Main;

public class Main {
      
	public static void main(String[] args) {
		// object and memory slide 14, 10, 8;
		// Object -oriented programming
		Employee  empOne = new Employee ("John", "Smith", 12345, "Sales");
		Employee  empTwo = new Employee ("Mark", "Smith",4322, "Sales");
		Manager ManagerThree = new Manager("David", "Smith",5678, "Manager", "Sales TimeCards");
        System.out.println(empOne);
        System.out.println(empTwo);
        System.out.println(ManagerThree);
	}
	
	

}
