package com.capg.springboot.traineeDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capg.springboot.trainee.Trainee;

@Repository
public interface TraineeDao extends JpaRepository<Trainee, Integer> {

}
