package project3;

public class Cirlce implements Shape {
	private float radius;
	public Cirlce(float r) {
		radius = r;
	}
	public float getArea()
	{
		return 3.14f*radius*radius;
	}
	public float getPerimeter()
	{
		return 2*3.14f*radius;
	}
}
