package com.Liv2Train.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Liv2Train.model.TrainingCenter;
import com.Liv2Train.service.TrainingCenterService;

@RestController
@RequestMapping("/api/training-centers/")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping("/createTrainingCenter")
    public ResponseEntity<TrainingCenter> createTrainingCenter(
            @Validated @RequestBody TrainingCenter trainingCenter) {
    	 TrainingCenter savedCenter = service.saveTrainingCenter(trainingCenter);
         return new ResponseEntity<>(savedCenter, HttpStatus.CREATED); 
      
    }

    @GetMapping("/getAllTrainingCenters")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return new ResponseEntity<>(centers,HttpStatus.OK);
    }
}
