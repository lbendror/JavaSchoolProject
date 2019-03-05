package jb.school3.people;

import java.util.ArrayList;

import jb.school3.building.ClassRoom;

public class Teacher extends Person {

	//private ClassRoom[] classes;
	private ArrayList<ClassRoom> classes;
	
	public Teacher(String name) {
		this.name = name;
		classes = new ArrayList<>();
	}

	public void addClass(ClassRoom classRoom) {

		classes.add(classRoom);
		System.out.println("Added " + classRoom + " to " + this);
	}
	
	@Override
	public void sendUpdate(String message) {
		System.out.println("Sending message '" + message + "' by email to " + this);
	}
	
	@Override
	public String toString() {
		return "Teacher: " + name;
	}
}
