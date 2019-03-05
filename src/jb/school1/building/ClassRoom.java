package jb.school1.building;

import jb.school1.people.Student;
import jb.school1.people.Teacher;

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
