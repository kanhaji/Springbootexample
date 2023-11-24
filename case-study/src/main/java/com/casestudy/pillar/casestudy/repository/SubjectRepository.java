package com.casestudy.pillar.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.pillar.casestudy.model.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer> {

}
