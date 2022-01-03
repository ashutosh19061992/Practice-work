package com.xoriant.casestudy3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assesment {

	private String assesmentId;
	private String assesmentDescription;
	private int noOfQuestion;
	private Date dateOfAssingment;
	private List<Question> questions = new ArrayList<>();

	public Assesment(String assesmentId, String assesmentDescription, int noOfQuestion, Date dateOfAssingment) {
		super();
		this.assesmentId = assesmentId;
		this.assesmentDescription = assesmentDescription;
		this.noOfQuestion = noOfQuestion;
		this.dateOfAssingment = dateOfAssingment;
	}

	public Assesment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAssesmentId() {
		return assesmentId;
	}

	public void setAssesmentId(String assesmentId) {
		this.assesmentId = assesmentId;
	}

	public String getAssesmentDescription() {
		return assesmentDescription;
	}

	public void setAssesmentDescription(String assesmentDescription) {
		this.assesmentDescription = assesmentDescription;
	}

	public int getNoOfQuestion() {
		return noOfQuestion;
	}

	public void setNoOfQuestion(int noOfQuestion) {
		this.noOfQuestion = noOfQuestion;
	}

	public Date getDateOfAssingment() {
		return dateOfAssingment;
	}

	public void setDateOfAssingment(Date dateOfAssingment) {
		this.dateOfAssingment = dateOfAssingment;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public boolean addQuestion(Question question) {
		return this.questions.add(question);
	}

	@Override
	public String toString() {
		return "Assesment [assesmentId=" + assesmentId + ", assesmentDescription=" + assesmentDescription
				+ ", noOfQuestion=" + noOfQuestion + ", dateOfAssingment=" + dateOfAssingment + ", questions="
				+ questions + ", getAssesmentId()=" + getAssesmentId() + ", getAssesmentDescription()="
				+ getAssesmentDescription() + ", getNoOfQuestion()=" + getNoOfQuestion() + ", getDateOfAssingment()="
				+ getDateOfAssingment() + ", getQuestions()=" + getQuestions() + "]";
	}

}
