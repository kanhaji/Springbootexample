package com.casestudy.pillar.casestudy.model;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Student {

	
@Id
private int studentId;
private String studentName;
private int rollNo;
public Student() {
	this.studentId=new Random().nextInt();
	this.studentName = UUID.randomUUID().toString();
}
@OneToMany(targetEntity = Subject.class)
private List<Subject> subjectList;

}
