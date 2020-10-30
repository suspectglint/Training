package inheritance_project;

public class Main {

	public static void main(String[] args) {
		/*Person p = new Person("Sravan","Hyderabad");
		p.display();
		Employee e = new Employee("Sravan","Hyderabad",103,10000);
		e.display();
		Student s = new Student("Sravan","Hyderabad",278,600);
		s.display();*/
		Person p = new Person("Sravan","Hyderabad");
		p.display();
		System.out.println("------");
		p = new Employee("Sravan","Hyderabad",101,30000);
		p.display();
		System.out.println("------");
		p = new Student("Sravan","Hyderabad",279,984);
		p.display();
	}

}
