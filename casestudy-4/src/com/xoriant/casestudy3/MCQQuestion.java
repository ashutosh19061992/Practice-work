package com.xoriant.casestudy3;

import java.util.HashMap;

public class MCQQuestion extends Question {
	// Ex- {"a"-> "xyz", "b" -> "pqr", "c" -> "lmn" .... }
	private String userSelectedChoice;
	private HashMap<String, String> options = new HashMap<String, String>();
	private String rightOption;
	private String mcqQuestionDesciption;

	public MCQQuestion(String questionId, String questionTopic, String mcqQuestionDesciption,
			HashMap<String, String> options, String rightOption, String userSelectedChoice) {
		super(questionId, questionTopic, 5);
		this.options = options;
		this.rightOption = rightOption;
		this.userSelectedChoice = userSelectedChoice;
		this.mcqQuestionDesciption = mcqQuestionDesciption;
	}

	public MCQQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HashMap<String, String> getOptions() {
		return options;
	}

	public void setOptions(HashMap<String, String> options) {
		this.options = options;
	}

	public String getRightOption() {
		return rightOption;
	}

	public void setRightOption(String rightOption) {
		this.rightOption = rightOption;
	}

	public String getUserSelectedChoice() {
		return userSelectedChoice;
	}

	public void setUserSelectedChoice(String userSelectedChoice) {
		this.userSelectedChoice = userSelectedChoice;
	}

	public String getMcqQuestionDesciption() {
		return mcqQuestionDesciption;
	}
	
	public void setMcqQuestionDesciption(String mcqQuestionDesciption) {
		this.mcqQuestionDesciption = mcqQuestionDesciption;
	}

	@Override
	public String toString() {
		return "MCQQuestion [userSelectedChoice=" + userSelectedChoice + ", options=" + options + ", rightOption="
				+ rightOption + ", mcqQuestionDesciption=" + mcqQuestionDesciption + ", getOptions()=" + getOptions()
				+ ", getRightOption()=" + getRightOption() + ", getUserSelectedChoice()=" + getUserSelectedChoice()
				+ ", getMcqQuestionDesciption()=" + getMcqQuestionDesciption() + ", getQuestionId()=" + getQuestionId()
				+ ", getQuestionTopic()=" + getQuestionTopic() + ", getTotalMarks()=" + getTotalMarks() + "]";
	}
	
	@Override
	public double marksCalculation(Question question) {
		double allocatedMarks = 0.0;
		MCQQuestion mcqQuestion = ((MCQQuestion) question);
		String userChoice = mcqQuestion.getOptions().get(mcqQuestion.getUserSelectedChoice());
		// wrong choice
		if (userChoice != null && userChoice.equals(mcqQuestion.getRightOption())) {
			// if correct choice
			allocatedMarks = this.getTotalMarks();
			// if unattempted
		} else if (userChoice == null) {
			return allocatedMarks;
		} else {

			return allocatedMarks - 0.4;
		}
		return allocatedMarks;
	}
}
