package com.xoriant.casestudy3;

public class HandsOnQuestion extends Question {

	private String questionDescription;
	private int asnwerInNoOfLine;
	private int wrongSpellingCount;

	public HandsOnQuestion(String questionId, String questionTopic, String questionDescription, int noOfLines,
			int wrongSpellings) {

		super(questionId, questionTopic, 40.00);
		this.questionDescription = questionDescription;
		this.asnwerInNoOfLine = noOfLines;
		this.wrongSpellingCount = wrongSpellings;
	}

	public HandsOnQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNoOfLines() {
		return asnwerInNoOfLine;
	}

	public void setNoOfLines(int noOfLines) {
		this.asnwerInNoOfLine = noOfLines;
	}

	public int getWrongSpellingCount() {
		return wrongSpellingCount;
	}

	public void setWrongSpellingCount(int wrongSpellings) {
		this.wrongSpellingCount = wrongSpellings;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	@Override
	public String toString() {
		return "HandsOnQuestion [questionDescription=" + questionDescription + ", noOfLines=" + asnwerInNoOfLine
				+ ", wrongSpellings=" + wrongSpellingCount + ", getNoOfLines()=" + getNoOfLines()
				+ ", getWrongSpellings()=" + getWrongSpellingCount() + ", getQuestionDescription()="
				+ getQuestionDescription() + ", getQuestionId()=" + getQuestionId() + ", getQuestionTopic()="
				+ getQuestionTopic() + ", getTotalMarks()=" + getTotalMarks() + "]";
	}

	@Override
	public double marksCalculation(Question question) {

		double allocatedMarks = question.getTotalMarks() - 5;
		HandsOnQuestion handsOnQuestion = ((HandsOnQuestion) question);

		if (handsOnQuestion.getNoOfLines() >= 5) {
			allocatedMarks = allocatedMarks - 10;
		} else if (handsOnQuestion.getWrongSpellingCount() >= 5) {
			allocatedMarks = allocatedMarks - 10;
		}
		return allocatedMarks;
	}
}
