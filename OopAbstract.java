package oopAbstract;

public class OopAbstract {


	public static void main(String[] args) {
		
		System.out.println("Circle informations...");
		Circle c = new Circle();
		c.setColor("green");
		c.setFilled(true);
		c.circleInfo();
		
		System.out.println("Rectangle informations...");
		Rectangle r = new Rectangle();
		r.setColor("red");
		r.setFilled(true);
		r.rectInfo();
		
		System.out.println("Square informations...");
		Square s = new Square();
		s.setColor("yellow");
		s.setFilled(true);
		s.squareInfo();
	}

}
