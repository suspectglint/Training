package hsbc;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private int customerId;
	private String name;
	private float amount;
	@Autowired
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	public Customer() {
		
	}
	
	public Customer(int customerId, String name, float amount) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.amount = amount;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", amount=" + amount + ", address=" + address
				+ "]";
	}

}
