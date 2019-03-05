package jb.school2.people;

import jb.school2.building.ClassRoom;

public class Teacher extends Person {

	private ClassRoom[] classes;
	
	public Teacher(String name) {
		this.name = name;
		classes = new ClassRoom[3];
	}

	public void addClass(ClassRoom classRoom) {

		boolean addedClass = false;
		
		for (int i=0; i<classes.length; i++) {
			if (classes[i] == null) {
				classes[i] = classRoom;
				addedClass = true;
				break;
			}
		}
		
		if (!addedClass) {
			System.out.println("Error: can't add another class! Teacher is already full!");
		}
	}
}
