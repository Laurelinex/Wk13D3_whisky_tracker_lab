package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    public List<Whisky> findWhiskiesByYear(int year);

    public List<Whisky> findWhiskiesByDistilleryIdAndAge(Long id, int age);

    public List<Whisky> findWhiskiesByDistilleryRegion(String region);
}
