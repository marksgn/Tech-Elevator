package com.techelevator;

public class QuizQuestion {

	private String question;
	private String[] answers = new String[4];
	private int correctAnswerIndex;
	
	public QuizQuestion(String quizLine) { 
		String[] lineParts = quizLine.split("\\|");
		
		question = lineParts[0];
		for (int i = 1; i < 5; i++) {
			if (lineParts[i].contains("*")) {
				correctAnswerIndex = i;
			}
			answers[i-1] = lineParts[i].replace("*", "");
		}
	}
	
	public String getCorrectAnswerIndex() {
		return Integer.toString(correctAnswerIndex);
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getPossibleAnswersList() {
		return ("1." + answers[0] + "\n" + "2." + answers[1] + "\n" + "3." + answers[2] + "\n" + "4." + answers[3]);
	}
}
