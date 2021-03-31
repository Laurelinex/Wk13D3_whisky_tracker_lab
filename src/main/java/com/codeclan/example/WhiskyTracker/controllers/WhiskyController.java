package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskies(){
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/{year}")
    public ResponseEntity<List<Whisky>> getWhiskiesByYear(@PathVariable int year){
        return new ResponseEntity<>(whiskyRepository.findWhiskiesByYear(year), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/distilleries/{id}")
    public ResponseEntity<List<Whisky>> getWhiskiesByDistilleryId(@PathVariable Long id){
        return new ResponseEntity<>(whiskyRepository.findWhiskiesByDistilleryId(id), HttpStatus.OK);
    }


    @GetMapping(value = "/whiskies/distilleries/{id}/{age}")
    public ResponseEntity<List<Whisky>> getWhiskiesByDistilleriesByYear(@PathVariable Long id, @PathVariable int age){
        return new ResponseEntity<>(whiskyRepository.findWhiskiesByDistilleryIdAndAge(id, age), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/distilleries/{region}")
    public ResponseEntity<List<Whisky>> getWhiskiesByDistilleryRegion(@PathVariable String region){
        return new ResponseEntity<>(whiskyRepository.findWhiskiesByDistilleryRegion(region), HttpStatus.OK);
    }
}
