package com.capg.demo.dao;

import java.sql.SQLException;

import com.capg.demo.model.Trainee;

public interface TraineeDao {
	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public Trainee findTrainee(int id) throws SQLException;
	public void removeTrainee(int id) throws SQLException;

}
