package circle;

public class Demo {

	public static void main(String[] args) {
		Circle c1 = new Circle(); // default constructor, also no-arg cont.
//		Circle c2 = c1;
//		c1 = null;
//		c2 = null;
		c1.setRadius(1);
		System.out.println(c1);
		System.out.println("-------------------");
		Circle c2 = new Circle();
		c2.setRadius(2);
		System.out.println(c2
				);
		System.out.println("-------------------");
		Circle c3 = new Circle(10);
		System.out.println(c3.toString());
		System.out.println("-------------------");
		
	}

}
