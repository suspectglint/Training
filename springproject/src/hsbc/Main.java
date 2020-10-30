package hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Address a1 = (Address)ctx.getBean("add1");
		Customer c1 = (Customer)ctx.getBean("cust1");
		Customer c2 = (Customer)ctx.getBean("cust2");
		Customer c3 = (Customer)ctx.getBean("cust3");
		//System.out.println(c1);
		//System.out.println(c2);
		//System.out.println(c3);
		System.out.println(a1);
		System.out.println(c1);
	}

}
