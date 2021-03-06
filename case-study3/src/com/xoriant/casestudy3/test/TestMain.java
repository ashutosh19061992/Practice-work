package com.xoriant.casestudy3.test;

import com.xoriant.casestudy3.entities.Course;
import com.xoriant.casestudy3.entities.Module;
import com.xoriant.casestudy3.entities.Organization;
import com.xoriant.casestudy3.entities.Topic;
import com.xoriant.casestudy3.entities.Trainee;
import com.xoriant.casestudy3.entities.Trainer;
import com.xoriant.casestudy3.entities.Training;
import com.xoriant.casestudy3.entities.Unit;

public class TestMain {

	public static void main(String[] args) {

		Organization organization = new Organization("TechnoTech Organization");

		Trainer trainerOne = new Trainer("Ashutosh", organization);
		Trainee traineeOne = new Trainee("ONE");
		Trainee traineeTwo = new Trainee("TWO");
		Trainee traineeThree = new Trainee("THREE");
		Trainee traineeFour = new Trainee("FOUR");
		Trainee traineeFive = new Trainee("FIVE");
		Trainee traineeSix = new Trainee("SIX");

		// creating course
		Course course = new Course("Java Full Stack Course");

		Training javaTraining = new Training("Java Full Stack", trainerOne, course);

		javaTraining.addTraines(traineeOne);
		javaTraining.addTraines(traineeTwo);
		javaTraining.addTraines(traineeThree);
		javaTraining.addTraines(traineeFour);
		javaTraining.addTraines(traineeFive);
		javaTraining.addTraines(traineeSix);

		// creating unit
		Unit unit = new Unit(8.5, "Exceptional Handling");

		// creating Module --- Exceptional Handling Module
		Module exceptionalHandlingModule = new Module();

		// adding modules to course
		course.addModule(exceptionalHandlingModule);

		// creating topic --- For Exceptional Handling
		Topic tryBlockUsage = new Topic("try block usage");
		Topic catchBlockUsage = new Topic("catch block usage");
		Topic multiTryCatchBlock = new Topic("multi try catch block usage");
		Topic exceptionHerarchy = new Topic("Exception Herarchy usage");

		// adding topic to unit
		unit.addTopic(tryBlockUsage);
		unit.addTopic(catchBlockUsage);
		unit.addTopic(multiTryCatchBlock);
		unit.addTopic(exceptionHerarchy);
		exceptionalHandlingModule.addUnit(unit);

		// total number of trainees enrolled for a training
		System.out.println(javaTraining.getNoOfTrainees());

		// get Training organization name
		System.out.println(javaTraining.getTrainer().getOrganization().getName());

		// get Training duration for a course and unit wise.
		System.out.println(javaTraining.getTrainingDuration(course));

	}

}
