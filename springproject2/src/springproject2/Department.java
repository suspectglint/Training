package springproject2;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int departmentId =10;
	private String name = "Finance";
	private String address = "Delhi";
	
	public Department()
	{
		
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
