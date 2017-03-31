package chat;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
	// make a test conversation, create a student
	String[] testconvo = { "test", "hi", "Guten Morgen!", "Hey", "g2g" };
	Student student01 = new Student("Michael", "Cullimore", 97.5, testconvo);

	// test
	System.out.println(student01.toString());
	System.out.println(student01.conversations.get(0));
    }

    private String firstName;
    private String lastName;

    private double score;

    ArrayList<String> conversations;

    // create a student
    public Student(String firstN, String lastN, double _score, String[] convos) {
	this.firstName = firstN;
	this.lastName = lastN;
	this.score = _score;
	this.conversations = new ArrayList<>(Arrays.asList(convos));
    }

    public String getFirstName(String firstName) {
	return firstName;
    }

    public String getLastName(String lastName) {
	return lastName;
    }

    public double getScore(double score) {
	return score;
    }

    public void setScore(double score) {
	this.score = score;
    }

    @Override
    public String toString() {
	return firstName + " " + lastName + ": " + score + ", " + conversations + "}";
    }

}
