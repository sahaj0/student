package com.example.demo2.repo;

import com.example.demo2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface stdrepo extends JpaRepository<Student, Long> {
   public List<Student> findByBranch(String branch);
}
