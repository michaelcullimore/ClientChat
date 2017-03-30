package chat;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private double score;

    ArrayList<String> conversations;

    // create a student
    public Student(String firstN, String lastN, double _score, String[] convos) {
	this.setFirstName(firstN);
	this.setLastName(lastN);
	this.setScore(_score);
	this.conversations = new ArrayList<>(Arrays.asList(convos));

    }

    public double getScore() {
	return score;
    }

    public void setScore(double score) {
	this.score = score;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
}
