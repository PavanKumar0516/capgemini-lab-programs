package com.capg.demo.service;

import java.sql.SQLException;

import com.capg.demo.dao.TraineeDao;
import com.capg.demo.dao.TraineeDaoImp;
import com.capg.demo.model.Trainee;

public class TraineeServiceImp implements TraineeService {
	TraineeDao dao;
	public TraineeServiceImp() throws SQLException {
		dao=new TraineeDaoImp();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		return dao.addTrainee(trainee);
		
	}

	@Override
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trainee getTrainee(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
