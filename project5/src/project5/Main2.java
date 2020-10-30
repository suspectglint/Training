package project5;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		HashMap<Integer,Employee> emps = new HashMap<Integer,Employee>();
		emps.put(1,new Employee(1,"Anand",1000));
		emps.put(2,new Employee(2,"Bector",2000));
		emps.put(3,new Employee(3,"Chandan",3000));
        emps.put(4,new Employee(4,"Darpan",4000));
        emps.put(5,new Employee(5,"Eshwar",5000));
        emps.put(6,new Employee(6,"Fathima",6000));
        emps.put(7,new Employee(7,"Govind",7000));
        emps.put(8,new Employee(8,"Harshit",8000));
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        	System.out.println("Enter the Employee ID");
        	int id = sc.nextInt();
        	Employee e = emps.get(id);
        	if(e!=null)
        		e.show();
        	else
        	{
        		if(id==0)
        			break;
        		else
        			System.out.println("Please enter a Valid Employee ID!");
        	}        	
        }
        sc.close();
	}

}
