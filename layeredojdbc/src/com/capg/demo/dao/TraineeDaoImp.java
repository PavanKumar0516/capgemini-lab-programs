package com.capg.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capg.demo.model.Trainee;

public class TraineeDaoImp implements TraineeDao{
	Connection con;
	PreparedStatement ps;
	
	public TraineeDaoImp() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
														"system","admin");
		
	}
	
	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		ps=con.prepareStatement("insert into trainee values(?,?,?)");
		ps.setInt(1, trainee.getId());
		ps.setString(2, trainee.getName());
		ps.setString(3, trainee.getEmail());
		int rowsUpdated=ps.executeUpdate();
		if(rowsUpdated>0) {
			return trainee;
		}
		else
			return null;

	}

	@Override
	public Trainee findTrainee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTrainee(int id) {
		// TODO Auto-generated method stub

	}


}
