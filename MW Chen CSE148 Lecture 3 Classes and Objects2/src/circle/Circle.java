package circle;

public class Circle {
	private double radius;
	private static int numberOfCircles = 0;
	
	
	//overloaded constructors
	public Circle() {
		numberOfCircles++;
	}
	
	public Circle(double radius){
		this.radius = radius;
		numberOfCircles++;
	}
	
	public int getNumberOfCircles() {
		return numberOfCircles;
	}
	
	public double getArea() {
		return Math.PI * this.radius * radius;
	}
	
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}
	
	// setter method, mutator
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// getter method, accessor
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return 	"R = " + getRadius() + "\t" + 
				"A = " + getArea() + "\t" + 
				"C = " + getCircumference();
	}

}
