package com.ishmamruhan.Liv2Train.Dao;

import com.ishmamruhan.Liv2Train.Models.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepo extends JpaRepository<TrainingCenter, Long> {
    TrainingCenter findBycode(String code);     // To find Training center by Training Center Code

    TrainingCenter findByid(Long id);          //// To find Training center by Training Center id
}
