package com.kmii.kmiboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmii.kmiboard.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
	public Question findBySubject(String subject);
	

}
