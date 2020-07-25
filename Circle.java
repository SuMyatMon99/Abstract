package oopAbstract;

public class Circle extends Shape{
	double radius = 1.0;
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*2*radius;
	}
	public void circleInfo() {
		System.out.println(super.toString());
	}
}
