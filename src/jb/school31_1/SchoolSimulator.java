package jb.school31_1;

import jb.school31_1.other.Grade;
import jb.school31_1.people.Student;

public class SchoolSimulator {

	public static void main(String[] args) {

		Student student = new Student("Moshe", 1985);
		
		student.addGrade(new Grade("Math", 90));
		student.addGrade(new Grade("English", 92));
		student.addGrade(new Grade("History", 66));
		student.addGrade(new Grade("Hebrew", 91));
		student.addGrade(new Grade("Litrature", 70));
		student.addGrade(new Grade("Chemistry", 74));
		student.addGrade(new Grade("Physics", 75));
		student.addGrade(new Grade("Arabic", 80));
		student.addGrade(new Grade("Computer Science", 99));
		student.addGrade(new Grade("Tanach", 81));
		student.addGrade(new Grade("Biology", 76));
		
		int gradesAverage = student.getGradesAverage();
		
		System.out.println("Grades average: " + gradesAverage);
		
		/*
		School school = new School("John Bryce College");
		
		Student[] javaClassStudents = new Student[10];
		
		javaClassStudents[0] = new Student("Moshe", 1990);
		javaClassStudents[1] = new Student("David", 1991);
		javaClassStudents[2] = new Student("Miri", 1989);
		
		Teacher teacherRony = new Teacher("Rony");
		
		ClassRoom javaClass = new ClassRoom("Java Class", teacherRony, javaClassStudents);
		
		teacherRony.addClass(javaClass);
		*/
	}
}
