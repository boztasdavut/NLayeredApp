package Day3OdevDevam11.business;

import Day3OdevDevam11.core.logging.Logger;
import Day3OdevDevam11.dataAccess.BaseDao;
import Day3OdevDevam11.entities.Instructor;

public class InstructorManager implements BaseManager{

	BaseDao baseDao;
	Instructor instructor;
	Logger[] loggers;
	public InstructorManager(BaseDao baseDao) {
		this.baseDao = baseDao;
		this.instructor = instructor;
	}
	@Override
	public void add() throws Exception {
		baseDao.add(instructor);
		for(Logger logger: loggers) {
			logger.logger(instructor);
		}
	}

	@Override
	public void delete() {
		baseDao.delete(instructor);
		
	}

	@Override
	public void update() {
		baseDao.update(instructor);
		
	}
	

}
