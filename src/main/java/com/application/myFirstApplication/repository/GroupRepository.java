package com.application.myFirstApplication.repository;

import com.application.myFirstApplication.model.CourseGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<CourseGroup, Integer> {
}
