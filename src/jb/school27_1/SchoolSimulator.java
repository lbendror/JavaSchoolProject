package jb.school27_1;

import jb.school27_1.building.ClassRoom;
import jb.school27_1.building.School;
import jb.school27_1.people.Student;
import jb.school27_1.people.Teacher;

public class SchoolSimulator {

	public static void main(String[] args) {

		School school = new School("John Bryce College");
		
		Student[] javaClassStudents = new Student[10];
		
		javaClassStudents[0] = new Student("Moshe", 1990);
		javaClassStudents[1] = new Student("David", 1991);
		javaClassStudents[2] = new Student("Miri", 1989);
		
		Teacher teacherRony = new Teacher("Rony");
		
		ClassRoom javaClass = new ClassRoom("Java Class", teacherRony, javaClassStudents);
		
		teacherRony.addClass(javaClass);
	}
}
