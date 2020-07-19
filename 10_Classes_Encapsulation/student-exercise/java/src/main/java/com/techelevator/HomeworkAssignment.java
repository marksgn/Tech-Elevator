package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	
	/*LetterGrade is a derived property that is calculated using EarnedMarks and possibleMarks.

			For 90% or greater return "A"
			80-89% return "B"
			70-79% return "C"
			60-69% return "D"
			otherwise return "F"
			hint: PossibleMarks and EarnedMarks are integers. 
			What happens when a smaller integer is divided by a larger integer?
	*/
	

	public String getLetterGrade() {
		//letterGrade = earnedMarks / possibleMarks
		if (((1.0 * earnedMarks / possibleMarks) * 100) >= 90) {
			return "A";
		} else if ((((double) earnedMarks / possibleMarks) * 100) >= 80) {
			return "B";
		
		} else if ((((double) earnedMarks / possibleMarks) * 100) >= 70) {
			return "C";
		
		} else if ((((double) earnedMarks / possibleMarks) * 100) >= 60) {
			return "D";
			
		} else {
			return "F";
		}
	}

		
	public HomeworkAssignment (int possibleMarks) {//String submitterName) {
		this.possibleMarks = possibleMarks;
		//this.submitterName = submitterName;
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
}
