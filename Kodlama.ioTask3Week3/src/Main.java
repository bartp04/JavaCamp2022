import entities.*;
import business.*;
import dataAccess.*;
import core.logging.*;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course();
		course.setName("Java");
		course.setPrice(460);

		Course course2 = new Course();
		course2.setName(".NET");
		course2.setPrice(360);

		Course course3 = new Course();
		course3.setName("C#");
		course3.setPrice(199);

		Logger[] loggers = { new EmailLogger(), new FileLogger(), new DatabaseLogger() };

		CourseManager courseManager = new CourseManager(loggers, new HibernateDao());
		courseManager.add(course);
		System.out.println();
		courseManager.add(course2);
		System.out.println();
		courseManager.add(course3);
		System.out.println();

		Instructor instructor = new Instructor("Engin ", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(loggers, new HibernateDao());
		instructorManager.add(instructor);
		System.out.println();

		Category category = new Category();
		category.setName("Software Developing");
		Category category2 = new Category();
		category2.setName("Full Stack Developing");

		CategoryManager categoryManager = new CategoryManager(loggers, new HibernateDao());
		categoryManager.add(category);
		System.out.println();
		categoryManager.add(category2);

	}

}
