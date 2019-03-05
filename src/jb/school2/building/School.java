package jb.school2.building;

public class School {

	private String schoolName;
	private ClassRoom[] classes;
	
	public School(String schoolName) {
		this.schoolName = schoolName;
		classes = new ClassRoom[10];
	}
	
	public School(String schoolName, int numOfClasses) {
		this.schoolName = schoolName;
		classes = new ClassRoom[numOfClasses];
	}
}
