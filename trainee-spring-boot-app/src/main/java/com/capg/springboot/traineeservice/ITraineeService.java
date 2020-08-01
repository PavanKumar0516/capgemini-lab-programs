package com.capg.springboot.traineeservice;

import java.util.Optional;
import com.capg.springboot.trainee.Trainee;

public interface ITraineeService {
	public Trainee addTrainee(Trainee obj);
	public Trainee updateTrainee(Trainee emp);
	public Optional<Trainee> selectTrainee(int eid);
	public void deleteTrainee(int eid);

}
