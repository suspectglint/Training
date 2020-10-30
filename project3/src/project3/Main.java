package project3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Square(3);
		System.out.println("Area = "+s.getArea());
		System.out.println("Perimeter = "+s.getPerimeter());
        s = new Cirlce(5);
        System.out.println("----------");
		System.out.println("Area = "+s.getArea());
		System.out.println("Perimeter = "+s.getPerimeter());		
	}

}
