package business;

import java.util.*;
import entities.Course;
import dataAccess.*;
import core.logging.*;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	List <Course> courseList = new ArrayList<>();

	public CourseManager(Logger[] loggers,CourseDao courseDao) {

		this.loggers = loggers;
		this.courseDao = courseDao;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Course couldn't be added because the price must be above 0");
		}
		
		for(Course courses: courseList) {
			if(courses.getName().equals(course.getName())) {
				throw new Exception("Name already exists.");
			}
		}
		
		courseList.add(course);
		
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log();
		}
	}

}
