package oopAbstract;

public class Rectangle extends Shape{
	double width = 1.0;
	double length = 1.0;
	public Rectangle() {}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double newLength) {
		this.length = newLength;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}
	public void rectInfo() {
		System.out.println(super.toString());
	}
}
