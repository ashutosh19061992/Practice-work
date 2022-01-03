package com.xoriant.casestudy3.maintest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.xoriant.casestudy3.Assesment;
import com.xoriant.casestudy3.Course;
import com.xoriant.casestudy3.HandsOnQuestion;
import com.xoriant.casestudy3.Iteration;
import com.xoriant.casestudy3.MCQQuestion;
import com.xoriant.casestudy3.Question;
import com.xoriant.casestudy3.TrainingModel;

public class TestMain {

	public static void main(String[] args) {

		TrainingModel trainingModel = new TrainingModel("IBM Training.");

		Course angularCourse = new Course("Angular");
		Iteration angularIteration = new Iteration(angularCourse);
		trainingModel.addIteration(angularIteration);

		Question angularHandsOnQuestion = new HandsOnQuestion("ANG-HAN-01", "Angilar Basics Level-1",
				"Define components and its usage?", 10, 10);

		HashMap<String, String> angularMCQOptions = new HashMap<String, String>();
		angularMCQOptions.put("a", "SPAs");
		angularMCQOptions.put("b", "MPAs");
		angularMCQOptions.put("c", "DPAs");
		angularMCQOptions.put("d", "CPAs");

		String angularMCQCorrectAnswer = "SPAs";
		Question angularMCQQuestionOne = new MCQQuestion("ANG-MCQ-01", "Angular Basics MCQ Level-1",
				"AngularJS is perfect for? ", angularMCQOptions, angularMCQCorrectAnswer, "b");

//		----------------------------------------------------------------------------------------------------------------------------------

		Course javaCourse = new Course("Java Full Stack");
		Iteration javaIteration = new Iteration(javaCourse);

		Question javaHandsOnQuestion = new HandsOnQuestion("JAVA-HAN-01", "Java Basics Level-1",
				"Define all OPPS conceps with example?", 10, 10);

		HashMap<String, String> mcqQuestionOneOptions = new HashMap<String, String>();

		mcqQuestionOneOptions.put("a", "static");
		mcqQuestionOneOptions.put("b", "final");
		mcqQuestionOneOptions.put("c", "transient");
		mcqQuestionOneOptions.put("d", "none of these.");

		String correctAnswer = "final";
		Question javaMCQQuestion = new MCQQuestion("MCQ-01", "Java Basics MCQ Level-1",
				"Which keyword is used to avoid overloading in java ?", mcqQuestionOneOptions, correctAnswer, "a");

		List<Iteration> iterations = trainingModel.getIterations();

		trainingModel.addIteration(javaIteration);
		trainingModel.addIteration(angularIteration);

		// Java {@ Assesment}
		Assesment java = new Assesment("JAV-ASING-01", "Java Basic- Description/MCQS", 2, new Date());
		java.addQuestion(javaMCQQuestion);
		java.addQuestion(javaHandsOnQuestion);

		// Angular {@ Assesment}
		Assesment angularAssesment = new Assesment("ANG-ASIGN-01", "Angulat Basic- Description", 20, new Date());
		angularAssesment.addQuestion(angularHandsOnQuestion);
		angularAssesment.addQuestion(angularMCQQuestionOne);

		javaCourse.addAssesment(java);

		// assesment through {java @Iteration}
		javaIteration.addAssesment(java);

		// assesment through {angular @Assesment}
		angularIteration.addAssesment(angularAssesment);
		// get no of hands on question for {java @Assesment}
		System.out.println("---------------------------------------------------------------------------------");
		System.out
				.println("Java Assesment hands on question: " + trainingModel.getNumHandsOnQuestionsForAssesment(java));
		System.out.println("---------------------------------------------------------------------------------");

		// get no MCQ Questions for {angular @Assesment}
		System.out.println("Java Assesment MCQ questions: " + trainingModel.getNumMCQQuestionsForAssesment(java));
		System.out.println("---------------------------------------------------------------------------------");

		// get no MCQ Questions for {java @Iteration}
		System.out.println("Total no of MCQ Questions for java iteration: "
				+ trainingModel.getTotalMCQOnQuestionForIteration(javaIteration));
		System.out.println("---------------------------------------------------------------------------------");

		// get no MCQ Questions for {angular @Iteration}
		System.out.println("Total no of MCQ Questions for angular iteration: "
				+ trainingModel.getTotalMCQOnQuestionForIteration(angularIteration));
		System.out.println("---------------------------------------------------------------------------------");
		// get no MCQ Questions for {java @Course}
		System.out.println("Total Score MCQ + HandsOnQuestion: "
				+ trainingModel.getTotalScoreOfAllAssesmentForACourse(javaCourse));
	}
}
