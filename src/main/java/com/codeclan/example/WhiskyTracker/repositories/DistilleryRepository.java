package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
    public List<Distillery> findDistilleriesByRegion(String region);

    public List<Distillery> findDistilleriesByWhiskiesAgeGreaterThan(int age);
}
