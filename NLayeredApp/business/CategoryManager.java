package Day3OdevDevam11.business;

import java.util.ArrayList;

import Day3OdevDevam11.core.logging.Logger;
import Day3OdevDevam11.dataAccess.BaseDao;
import Day3OdevDevam11.entities.Category;

public class CategoryManager implements BaseManager{

	ArrayList<String> categoryNames = new ArrayList<String>();
	BaseDao baseDao;
	Logger[] loggers;
	public Category category;
	public CategoryManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
		
	}
	@Override
	public void add() throws Exception {
		if(categoryNames.contains(category.getCategoryName())){
			throw new Exception("Bu isimli bir kategori zaten mevcut");
		}
		categoryNames.add(category.getCategoryName());
		baseDao.add(category);
		for(Logger logger: loggers) {
			logger.logger(category);
		}
		
		
	}

	@Override
	public void delete() {
		baseDao.delete(category);
		
	}

	@Override
	public void update() {
		baseDao.delete(category);
		
	}

	
	
	
	

}
