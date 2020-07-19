package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker { //test_quiz.txt

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<QuizQuestion> questionList = new ArrayList<QuizQuestion>();
		
		System.out.println("Please enter the path to the quiz file: ");
		String quizFilePath = input.nextLine();
		File quizFile = new File(quizFilePath);
		
		try (Scanner quizScanner = new Scanner(quizFile)) {
			while (quizScanner.hasNextLine()) {
				QuizQuestion currentQuestion = new QuizQuestion(quizScanner.nextLine());
				questionList.add(currentQuestion);
				//System.out.println(quizScanner.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.out.println("Can't find the quiz file.");
		}
		for (QuizQuestion q : questionList) { 
		System.out.println(q.getQuestion());
		System.out.println(q.getPossibleAnswersList());
		String userAnswer = input.nextLine();
		System.out.println("Your Answer: " + userAnswer);
		
		
		if (userAnswer.equals(q.getCorrectAnswerIndex())) {
			System.out.println("Correct!");
		}else {
			
			System.out.println("Sorry, that is incorrect.");
		}
		System.out.println(" ");
	
		}
		
		
		
	}

}