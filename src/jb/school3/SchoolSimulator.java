package jb.school3;

import jb.school3.building.ClassRoom;
import jb.school3.building.School;
import jb.school3.people.Student;
import jb.school3.people.Teacher;

public class SchoolSimulator {

	public static void main(String[] args) {

		// Part 3
		School school = new School("John Bryce Elementary");

		Teacher t1 = new Teacher("Rony");
		Teacher t2 = new Teacher("Yossi");
		
		Student s1 = new Student("Maya", 1990);
		Student s2 = new Student("Rotem", 1991);
		
		school.addPerson(s1);
		school.addPerson(s2);
		school.addPerson(t1);
		school.addPerson(t2);
		
		school.sendUpdateToAll("Hello to all school people! :)");
		
		
		// Part 4
		int numOfGradesInSchool = 6;
		int numOfClassesPerGrade = 3;
		
		for (int i=1; i<=numOfGradesInSchool; i++) {
			
			for (int j=1; j<=numOfClassesPerGrade; j++) {
				String className = "Class-" + i + "-" + j;
				school.addClassRoom(className, new ClassRoom(className));
			}
		}
	}
}
