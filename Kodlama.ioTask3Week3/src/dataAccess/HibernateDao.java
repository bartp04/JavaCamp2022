package dataAccess;
import entities.*;

public class HibernateDao implements CourseDao, InstructorDao, CategoryDao {

	public void add (Course course) {

		System.out.println( course.getName() + " is added with Hibernate.");

	}

	public void add (Category category) {
		System.out.println( category.getName() + " is added with Hibernate.");

	}

	public void add (Instructor instructor) {
		System.out.println( instructor.getFirstName()  + instructor.getLastName() +" is added with Hibernate.");

	}

}
