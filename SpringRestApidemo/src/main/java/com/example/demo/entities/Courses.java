package com.example.demo.entities;

public class Courses {
	private long CourseID;
	private String CourseTitle;
	private String CourseDescription;
	
	public Courses(long courseID, String courseTitle, String courseDescription) {
		super();
		this.CourseID = courseID;
		this.CourseTitle = courseTitle;
		this.CourseDescription = courseDescription;
	}

	public Courses() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public long getCourseID() {
		return CourseID;
	}

	public void setCourseID(long courseID) {
		this.CourseID = courseID;
	}

	public String getCourseTitle() {
		return CourseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.CourseTitle = courseTitle;
	}

	public String getCourseDescription() {
		return CourseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.CourseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "Courses [CourseID=" + CourseID + ", CourseTitle=" + CourseTitle + ", CourseDescription="
				+ CourseDescription + "]";
	}
	
	
//	public Courses(long CourseID, String CourseTitle, String CourseDescription)
//	{
//		Super();
//		
//	}
	

}
