package oopAbstract;

public abstract class Shape {
	String color;
	Boolean filled;
	
	public Shape() {}
	
	public Shape(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public Boolean getFilled() {
		return filled;
	}
	
	public void setFilled(Boolean newFilled) {
		this.filled = newFilled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		return "Color: " + color + '\n' + "Filled: " + filled + '\n' + "Area: " + getArea() + '\n' + "Perimeter: " + getPerimeter() + '\n';
	}
}
