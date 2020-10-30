package inheritance_project;

public class Student extends Person {
	private int stdId;
	private float marks;
	public Student(String name,String address,int stdId, float marks) {
		super(name,address);
		this.stdId = stdId;
		this.marks = marks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void display()
	{
		super.display();
		System.out.println("StudentID : "+stdId);
		System.out.println("Marks : "+marks);
	}
}
