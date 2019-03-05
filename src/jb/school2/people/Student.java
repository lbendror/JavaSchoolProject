package jb.school2.people;

import jb.school2.other.Grade;

public class Student extends Person {

	private Grade[] grades;

	public Student(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		grades = new Grade[10];
	}

	public void addGrade(Grade grade) {

		boolean addedGrade = false;

		for (int i=0; i<grades.length; i++) {
			if (grades[i] == null) {
				grades[i] = grade;
				addedGrade = true;
				System.out.println("Added " + grade + " to " + this);
				break;
			}
		}

		if (!addedGrade) {
			System.out.println("Error: can't add " + grade + " to " + this + ". Grades array is already full!");
		}
	}
	
	public int getGradesAverage() {
		
		int gradesSum = 0;
		int numOfGrades = 0;
		
		for (Grade grade : grades) {
			if (grade != null) {
				gradesSum += grade.getPoints();
				numOfGrades++;
			}
		}
		
		int gradesAverage = gradesSum / numOfGrades;
		
		return gradesAverage;
	}
	
	public String toString() {
		return "Student: " + name;
	}
}
 