package com.xoriant.casestudy3;

public abstract class Question {

	private String questionId;
	private String questionTopic;
	private double totalMarks;

	public Question(String questionId, String questionTopic, double totalMarks) {
		super();
		this.questionId = questionId;
		this.questionTopic = questionTopic;
		this.totalMarks = totalMarks;
	}

	public abstract double marksCalculation(Question question);

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTopic() {
		return questionTopic;
	}

	public void setQuestionTopic(String questionTopic) {
		this.questionTopic = questionTopic;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionTopic=" + questionTopic + ", totalMarks=" + totalMarks
				+ "]";
	}
}
