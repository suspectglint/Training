
public class Point {
	private int x;
	private int y;
	
	public Point()
	{
		this.x = this.y = 0;
	}
	
	public Point(int x,int y)
	{
		if (x<0)
			this.x =0;
		else
		{
			if(x>79)
				this.x =79;
			else
				this.x=x;
		}
		if(y<0 )
			this.y=0;
		else
		{
			if(y>19)
				this.y=19;
			else
				this.y=y;
		}
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void show()
	{
		System.out.println("Point is "+"("+this.x+","+this.y+")");
	}

}
