package com.capg.springboot.traineeservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.springboot.trainee.Trainee;
import com.capg.springboot.traineeDao.TraineeDao;

@Service
public class TraineeService implements ITraineeService {
	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addTrainee(Trainee t1) {
		
		return dao.save(t1);
	}

	@Override
	public Trainee updateTrainee(Trainee t2) {
		
		return dao.save(t2);
	}

	@Override
	public Optional<Trainee> selectTrainee(int tid) {
		
		return dao.findById(tid);
	}

	@Override
	public void deleteTrainee(int tid) {
		dao.deleteById(tid);
		
		
	}

}
