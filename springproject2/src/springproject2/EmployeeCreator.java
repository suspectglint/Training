package springproject2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeCreator {
	@Bean(name="emp1")
	public Employee getFirstEmployee()
	{
		return new Employee(1,"Sravan",2000);
	}
	@Bean(name="emp2")
	public Employee getSecondEmployee()
	{
		return new Employee(2,"Reddy",3000);
	}
	@Bean(name="emp3")
	public Employee getThirdEmployee()
	{
		return new Employee(3,"Rokkam",4000);
	}	
}
