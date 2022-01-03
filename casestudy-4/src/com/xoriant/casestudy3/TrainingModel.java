package com.xoriant.casestudy3;

import java.util.ArrayList;
import java.util.List;

public class TrainingModel {

	private String clientName;
	private List<Iteration> iterations = new ArrayList<Iteration>(3);

	public TrainingModel(String clientName) {
		super();
		this.clientName = clientName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public List<Iteration> getIterations() {
		return iterations;
	}

	public boolean addIteration(Iteration iteration) {
		return this.iterations.add(iteration);
	}

	@Override
	public String toString() {
		return "TrainingModel [clientName=" + clientName + ", iterations=" + iterations + ", getClientName()="
				+ getClientName() + ", getIterations()=" + getIterations() + "]";
	}

	/**
	 * total assingment for a {@Course}
	 * 
	 * @param course
	 * @return
	 */
	public int getTotalAssignmentInTheTraining(Course course) {
		return course.getAssesments().size();
	}

	/**
	 * Total assingment for a {@link Iteration}
	 * 
	 * @param iteration
	 * @return
	 */
	public int getTotalAssignmentInTheTraining(Iteration iteration) {
		return iteration.getAssesments().size();
	}

	/**
	 * Total MCQ Ques for a {@Course}
	 * 
	 * @param course
	 * @return
	 */
	public int getTotalMCQQuestionForCourse(Course course) {
		int mcqQuestionCount = 0;
		for (Assesment assesment : course.getAssesments())
			for (Question question : assesment.getQuestions())
				if (question instanceof MCQQuestion) {
					mcqQuestionCount += 1;
				}

		return mcqQuestionCount;
	}

	/**
	 * total hands on question for a {@Iteration}
	 * 
	 * @param iteration
	 * @return
	 */
	public int getTotalHandsOnQuestionForIteration(Iteration iteration) {
		int handsOnQuestionCount = 0;
		for (Assesment assesment : iteration.getAssesments())
			for (Question question : assesment.getQuestions())
				if (question instanceof HandsOnQuestion) {
					handsOnQuestionCount += 1;
				}

		return handsOnQuestionCount;
	}

	/**
	 * totla MCQ question for a {@Iteration}
	 * 
	 * @param iteration
	 * @return
	 */
	public int getTotalMCQOnQuestionForIteration(Iteration iteration) {
		int mcqQuestionCount = 0;
		for (Assesment assesment : iteration.getAssesments())
			for (Question question : assesment.getQuestions())
				if (question instanceof MCQQuestion) {
					mcqQuestionCount += 1;
				}

		return mcqQuestionCount;
	}

	/**
	 * total Hands on question for a {@Course}
	 * 
	 * @param course
	 * @return
	 */
	public int getTotalHandsOnQuestionForCourse(Course course) {
		int handsOnQuestionCount = 0;
		for (Assesment assesment : course.getAssesments())
			for (Question question : assesment.getQuestions())
				if (question instanceof HandsOnQuestion) {
					handsOnQuestionCount += 1;
				}

		return handsOnQuestionCount;
	}

	/**
	 * total Num of Question for a {@Assesment}
	 * 
	 * @param assesment
	 * @return
	 */
	public int getNumMCQQuestionsForAssesment(Assesment assesment) {
		int mcqQuestionCount = 0;
		for (Question question : assesment.getQuestions())
			if (question instanceof MCQQuestion) {
				mcqQuestionCount += 1;
			}
		return mcqQuestionCount;
	}

	/**
	 * total hands on question for a {@Assesment}
	 * 
	 * @param assesment
	 * @return
	 */
	public int getNumHandsOnQuestionsForAssesment(Assesment assesment) {
		int handsOnQuestionCount = 0;
		for (Question question : assesment.getQuestions())
			if (question instanceof HandsOnQuestion) {
				handsOnQuestionCount += 1;
			}
		return handsOnQuestionCount;
	}

	/**
	 * get total score for a {@link Course}
	 * 
	 * @param course
	 * @return
	 */
	public double getTotalScoreOfAllAssesmentForACourse(Course course) {
		double marksCalculation = 0.0;
		for (Assesment assesment : course.getAssesments()) {
			for (Question question : assesment.getQuestions()) {
				marksCalculation += question.marksCalculation(question);
			}
		}
		return marksCalculation;
	}

	/**
	 * get total score for a {@link Iteration}
	 * 
	 * @param iteration
	 * @return
	 */
	public double getTotalScoreOfAllAssesmentForAIteration(Iteration iteration) {
		double marksCalculation = 0.0;
		for (Assesment assesment : iteration.getAssesments())
			for (Question question : assesment.getQuestions())
				marksCalculation += question.marksCalculation(question);
		return marksCalculation;
	}
}
