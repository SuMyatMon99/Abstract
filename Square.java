package oopAbstract;

public class Square extends Rectangle{
	double side;
	public Square() {}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super();
		this.side = side;
	}
	
	public void setWidth(double side) {
		this.width = side;
	}
	public void setLength(double sidh) {
		this.length = side;
	}
	
	public void squareInfo() {
		System.out.println(super.toString());
	}
}
