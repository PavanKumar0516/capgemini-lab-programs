package com.capg.demo.controller;

import java.sql.SQLException;

import com.capg.demo.model.Trainee;
import com.capg.demo.service.TraineeService;
import com.capg.demo.service.TraineeServiceImp;

public class TraineeController {
	TraineeService service;
		
		public TraineeController() throws SQLException {
		service=new TraineeServiceImp();
		}
		
		public Trainee addTrainee(Trainee trainee) throws SQLException {
			return service.addTrainee(trainee);
	}

}
