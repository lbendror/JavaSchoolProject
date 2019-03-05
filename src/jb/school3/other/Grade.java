package jb.school3.other;

public class Grade {

	private String subject;
	private int points;
	
	public Grade(String subject, int points) {
		
		this.subject = subject;
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Grade: " + subject + " - " + points;
	}

	public String getSubject() {
		return subject;
	}

	public int getPoints() {
		return points;
	}
}
