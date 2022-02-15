package com.ishmamruhan.Liv2Train.Service;

import com.ishmamruhan.Liv2Train.Dao.TrainingCenterRepo;
import com.ishmamruhan.Liv2Train.ExceptionManagement.CustomException.TrainingCenterException;
import com.ishmamruhan.Liv2Train.Models.TrainingCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingCenterService {
    @Autowired
    TrainingCenterRepo trainingCenterRepo;

    public TrainingCenter save(TrainingCenter tc){                         // Saving a single Training center
        trainingCenterRepo.save(tc);
        return tc;
    }

    public List<TrainingCenter> saveAll(List<TrainingCenter> tcs){        // Saving a list of Training Centers
        trainingCenterRepo.saveAll(tcs);
        return tcs;
    }

    public TrainingCenter getById(Long id) throws TrainingCenterException{      // Find Training Center by ID
        TrainingCenter tc=null;
        try{                                                                    // Handeling exception
            tc =  trainingCenterRepo.findByid(id);
            tc.getCode();
        }catch (Exception ex){
            throw new TrainingCenterException("No Training Center found of Id: "+id);
        }
        return tc;
    }


    public TrainingCenter getByCenterCode(String code) throws TrainingCenterException{        // Finding Training center by Code
        TrainingCenter tc =  new TrainingCenter();

        try{
             tc  =  trainingCenterRepo.findBycode(code);
            tc.getCode();
        }catch (Exception ex){
            throw new TrainingCenterException("No Training Center found of code: "+code);      // Handeling Exception
        }

        return tc;
    }

    public List<TrainingCenter> getAll(){
        return trainingCenterRepo.findAll();
    }       // Find All Training centers

}
