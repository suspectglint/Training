package inheritance_project;

public class Person {
	private String name;
	private String address;
	
	public Person()
	{
		name = "Alpha";
		address = "Undefined";
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}

}
