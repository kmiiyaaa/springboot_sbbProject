package com.kmii.kmiboard;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kmii.kmiboard.entity.Question;
import com.kmii.kmiboard.repository.QuestionRepository;

@SpringBootTest
public class Test01 {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	public void testJpa1() {
		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?"); //질문 제목
		q1.setContent("sbb에 대해 알고 싶습니다"); // 질문 내용
		q1.setCreateDate(LocalDateTime.now()); // 현재 시간 넣기
		//q1 -> entity 생성 완료
		questionRepository.save(q1);
		
		
		Question q2 = new Question();
		q2.setSubject("스프링부트 모델이 무엇인가요?"); //질문 제목
		q2.setContent("id는 자동 생성되는게 맞나요"); // 질문 내용
		q2.setCreateDate(LocalDateTime.now()); // 현재 시간 넣기
		//q1 -> entity 생성 완료
		questionRepository.save(q2);		
		
		
	}

}
