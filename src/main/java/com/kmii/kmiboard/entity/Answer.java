package com.kmii.kmiboard.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; //기본키, 자동증가
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	@CreatedDate
	private LocalDateTime createDate;
	
	//N:1 -> 답변들: 질문 ->@ManyToOne
	@ManyToOne
	private Question question;
	
	

}
