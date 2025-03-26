package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2*length + 2*width;
	}
	
	public boolean isSquare() {
		if(length == width) {
			return true;
		}
		return false;
	}
	
	public void draw() {
		StdDraw.rectangle(0.5, 0.5, width/2, length/2);
		StdDraw.show();
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0.5,0.2);
		System.out.println(r1.isSquare());
		System.out.print(r1.area());
		r1.draw();
	}

}
