package reflection;

public class Student {
	
	private int roll;
	private String name;
	private String course;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, String course) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
	}
	private void display()
	{
		System.out.println("Hi this is private function");
	}
	private void sum(int a ,int b)
	{
		System.out.println("Sum is: "+(a+b));
	}
	
	

}
