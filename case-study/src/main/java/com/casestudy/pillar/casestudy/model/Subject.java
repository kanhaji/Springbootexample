package com.casestudy.pillar.casestudy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
@Id
private int subjectId;
private String subjectName;
private String applicableClass;
private String applicableStream;
}
