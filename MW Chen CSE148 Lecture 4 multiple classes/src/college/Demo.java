package college;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("Object Oriented Programming", "CSE148");
		c1.setInstructor(new Instructor("Ben", "Chen"));
		c1.getInstructor().getName().setMiddleInital('A');
		c1.setTextbook(new Textbook("Intro to Java", 149.99));
		Student s1 = new Student("Adam", "Smith");
		Student s2 = new Student("Billy", "Joe");
		Student[] students = {s1, s2};
		c1.setStudent(students);
		System.out.println(c1);
	}

}
