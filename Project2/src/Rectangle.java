
public class Rectangle {
	private int length;
	private int breadth;
    public Rectangle()
    {
    	length=15;
    	breadth=10;
    }
    public Rectangle(int l,int b)
    {
    	this.length=l;
    	this.breadth=b;
    }
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	//Returns the area of the rectangle
    public int area()
    {
    	return length*breadth;
    }
    
    //Returns the perimeter of the rectangle
    public int perimeter()
    {
    	return 2*(length+breadth); 
    }
}
