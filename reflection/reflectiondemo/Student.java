package reflectiondemo;

import java.time.LocalDate;

public class Student {
	public int roll=11;
	private String name;
	protected String course;
	private long mobile;
	private LocalDate dob;

public Student(int roll, String name, String course, long mobile, LocalDate dob) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.mobile = mobile;
		this.dob = dob;
	}
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	private void display()
	{
		System.out.println("display function of student");
	}


}
