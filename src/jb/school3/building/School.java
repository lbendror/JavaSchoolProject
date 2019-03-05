package jb.school3.building;

import java.util.ArrayList;
import java.util.HashMap;

import jb.school3.people.Person;

public class School {

	private String schoolName;
	private HashMap<String, ClassRoom> classesMap;
	private ArrayList<Person> people;
	
	public School(String schoolName) {
		this.schoolName = schoolName;
		classesMap = new HashMap<>();
		people = new ArrayList<>();
	}
	
	public void addClassRoom(String className, ClassRoom classRoom) {
		classesMap.put(className, classRoom);
		System.out.println("Added " + classRoom + " to " + this);
	}
	
	public void addPerson(Person p) {
		people.add(p);
		System.out.println("Added " + p + " to " + this);
	}
	
	public void sendUpdateToAll(String message) {
		
		for (Person p : people) {
			p.sendUpdate(message);
		}
	}
	
	@Override
	public String toString() {
		return "School: " + schoolName;
	}
}
