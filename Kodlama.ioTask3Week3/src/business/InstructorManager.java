package business;

import entities.*;
import dataAccess.*;
import core.logging.*;

public class InstructorManager {

	private Logger[] loggers;
	private InstructorDao instructorDao;

	public InstructorManager(Logger[] loggers, InstructorDao instructorDao) {

		this.loggers = loggers;
		this.instructorDao = instructorDao;
	}

	public void add(Instructor instructor) {

		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log();
		}
	}

}
