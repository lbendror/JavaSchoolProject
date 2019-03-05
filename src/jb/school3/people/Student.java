package jb.school3.people;

import java.util.ArrayList;

import jb.school3.other.Grade;

public class Student extends Person {

	private ArrayList<Grade> grades;

	public Student(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		grades = new ArrayList<>();
	}

	public void addGrade(Grade grade) {
		System.out.println("Added " + grade + " to " + this);
		grades.add(grade);
	}
	
	public int getGradesAverage() {
		
		int gradesSum = 0;
		
		for (Grade grade : grades) {
			gradesSum += grade.getPoints();
		}
		
		int gradesAverage = gradesSum / grades.size();
		
		return gradesAverage;
	}
	
	@Override
	public void sendUpdate(String message) {
		System.out.println("Sending message '" + message + "' by snail mail to " + this);
	}
	
	public String toString() {
		return "Student: " + name;
	}
}
 