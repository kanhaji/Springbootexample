package com.casestudy.pillar.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.pillar.casestudy.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
