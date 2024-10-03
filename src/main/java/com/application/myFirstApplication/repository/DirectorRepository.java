package com.application.myFirstApplication.repository;

import com.application.myFirstApplication.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {

    Director findByEmail(String email);
}
