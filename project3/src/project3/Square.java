package project3;

public class Square implements Shape {
	private float side;
	
	public Square(float s)
	{
		side =s;
	}
	
	public float getArea()
	{
		return side*side;
	}
	public float getPerimeter()
	{
		return 4*side;
	}
}
