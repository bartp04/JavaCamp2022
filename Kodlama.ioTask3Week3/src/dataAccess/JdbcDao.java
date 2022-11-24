package dataAccess;

import entities.*;

public class JdbcDao implements CourseDao, InstructorDao, CategoryDao {

	public void add(Course course) {

		System.out.println(course.getName() + " is added with JDBC.");

	}

	public void add(Category category) {
		System.out.println( category.getName() + " is added with JDBC.");

	}

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getLastName() + " is added with JDBC.");

	}

}
