package io.drucare.netflixzuulapigatewayserver;

public class student {
	public student() {
	}
	public student(String stdId, String stdName, String stdCourse) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCourse = stdCourse;
	}
	private String stdId;
	private String stdName;
	private String stdCourse;
	public String getId() {
		return stdId;
	}
	public void setId(String stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return stdName;
	}
	public void setName(String stdName) {
		this.stdName =stdName;
	}
	public String getCourse() {
		return stdCourse;
	}
	public void setCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
}