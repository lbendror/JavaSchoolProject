package jb.school2.building;

import jb.school2.people.Student;
import jb.school2.people.Teacher;

public class ClassRoom {

	private String className;
	private Student[] students;
	private Teacher teacher;
	
	public ClassRoom(String className, Teacher teacher, Student[] students) {
		this.className = className;
		this.teacher = teacher;
		this.students = students;
	}
}
