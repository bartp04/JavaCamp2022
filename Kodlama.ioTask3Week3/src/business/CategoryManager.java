package business;

import java.util.*;
import entities.*;
import dataAccess.*;
import core.logging.*;

public class CategoryManager {

	List<Category> categories = new ArrayList<>();
	private Logger[] loggers;
	private CategoryDao categoryDao;

	public CategoryManager(Logger[] loggers, CategoryDao categoryDao) {

		this.loggers = loggers;
		this.categoryDao = categoryDao;

	}

	public void add(Category category) throws Exception {

		for (Category categories : categories) {
			if (categories.getName().equals(category.getName())) {
				throw new Exception("Names of the categories can't be repeated.");
			}
		}

		categories.add(category);

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log();
		}
	}

}
