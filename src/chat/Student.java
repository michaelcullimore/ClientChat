package chat;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private double score;

    ArrayList<String> conversations;

    // create a student
    public Student(String firstN, String lastN, double _score, String[] convos) {
	this.firstName = firstN;
	this.lastName = lastN;
	this.score = _score;
	this.conversations = convos;// how do I initialize this???
    }
}
