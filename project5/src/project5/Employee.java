package project5;

public class Employee {

	private int empID;
	private String name;
	private float salary;
	public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
		salary = 10000;
	}
	
	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void show()
	{
		System.out.println("EmpId : "+empID);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);		
	}
	
	public void increment(int per)
	{
		this.salary = this.salary+ (this.salary*per)/100;
	}

}
