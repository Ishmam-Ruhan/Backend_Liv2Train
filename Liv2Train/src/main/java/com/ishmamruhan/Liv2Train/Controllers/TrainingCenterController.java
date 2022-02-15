package com.ishmamruhan.Liv2Train.Controllers;

import com.ishmamruhan.Liv2Train.ExceptionManagement.CustomException.TrainingCenterException;
import com.ishmamruhan.Liv2Train.Models.TrainingCenter;
import com.ishmamruhan.Liv2Train.Service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class TrainingCenterController {
    final String apiBasePathTcc = "/api/v1/training-center";

    @Autowired
    TrainingCenterService trainingCenterService;

    @PostMapping(apiBasePathTcc+"/save")                                //  Saving single Training center
    public ResponseEntity<TrainingCenter> save(@Valid @RequestBody TrainingCenter trainingCenter){
        return new ResponseEntity<>(trainingCenterService.save(trainingCenter), HttpStatus.OK);
    }

    @PostMapping(apiBasePathTcc+"/save-all")                          // Saving List of Training Centers
    public ResponseEntity<List<TrainingCenter>> saveAll(@Valid @RequestBody List<TrainingCenter> trainingCenters){
        return new ResponseEntity<>(trainingCenterService.saveAll(trainingCenters), HttpStatus.OK);
    }

    @GetMapping(apiBasePathTcc+"/get-all")                          // getting All Training Centers
    public ResponseEntity<List<TrainingCenter>> getAll(){
        return new ResponseEntity<>(trainingCenterService.getAll(),HttpStatus.OK);
    }

    @GetMapping(apiBasePathTcc+"/get/id/{id}")                    // Get Training center by ID
    public ResponseEntity<TrainingCenter> getById(@PathVariable("id") Long id) throws TrainingCenterException {
        return new ResponseEntity<>(trainingCenterService.getById(id),HttpStatus.OK);
    }

    @GetMapping(apiBasePathTcc+"/get/code/{code}")               // Get Training center by Code
    public ResponseEntity<TrainingCenter> getByCenterCode(@PathVariable("code") String code) throws TrainingCenterException{
        return new ResponseEntity<>(trainingCenterService.getByCenterCode(code),HttpStatus.OK);
    }
}
