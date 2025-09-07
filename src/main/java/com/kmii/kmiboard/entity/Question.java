package com.kmii.kmiboard.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity  // DB와 매핑할 entity 클래스로 설정
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // 질문 게시판의 글 번호 (기본키, 자동증가 옵션)
	
	@Column(length = 200) // 질문 게시판 제목은 200자까지 가능
	private String subject; // 질문게시판 제목
	
	@Column(columnDefinition = "TEXT") // 긴글도 가능
	private String content; // 질문 게시판 내용
	
	private LocalDateTime createDate;
	
	//1:N 관계 -> 질문 : 답변들 -> @OneToMany
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) 
	//mappedBy에 적은값은 answer에서 설정한 이름 , cascade - 질문글(부모글)이 삭제 될 경우, 답글들이 함께 삭제되게하는 설정
	private List<Answer> answerList;
	
}
