package jb.school3.building;

import java.util.ArrayList;

import jb.school3.people.Student;
import jb.school3.people.Teacher;

public class ClassRoom {

	private String className;
	//private Student[] students;
	private ArrayList<Student> students;
	private Teacher teacher;
	
	public ClassRoom(String className, Teacher teacher, ArrayList<Student> students) {
		this.className = className;
		this.teacher = teacher;
		this.students = students;
	}
	
	public ClassRoom(String className) {
		this.className = className;
		students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Added " + student + " to: " + this);
	}
	
	@Override
	public String toString() {
		return "School class: " + className;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
