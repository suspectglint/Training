package springproject2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empiD;
	private String name;
	private float salary;
	@Autowired
	private Department dept;
	public Employee(int empiD, String name, float salary) {
		super();
		this.empiD = empiD;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empiD=" + empiD + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

}
