package com.casestudy.pillar.casestudy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.pillar.casestudy.model.Student;
import com.casestudy.pillar.casestudy.repository.StudentRepository;

@Service
public class StudentService implements StudentRepository {

	@Autowired
	StudentRepository repository;

	@Override
	public <S extends Student> S save(S entity) {
		return repository.save(entity);
		// return null;
	}

	@Override
	public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {

		return repository.saveAll(entities);
	}

	@Override
	public Optional<Student> findById(Integer id) {
		return repository.findById(id);

	}

	@Override
	public boolean existsById(Integer id) {

		return repository.existsById(id);
	}

	@Override
	public Iterable<Student> findAll() {

		return repository.findAll();
	}

	@Override
	public Iterable<Student> findAllById(Iterable<Integer> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public long count() {

		return repository.count();
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Student entity) {
		repository.delete(entity);

	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		repository.deleteAllById(ids);

	}

	@Override
	public void deleteAll(Iterable<? extends Student> entities) {
		repository.deleteAll(entities);
		;
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

}
