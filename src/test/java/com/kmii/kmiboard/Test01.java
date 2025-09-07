package com.kmii.kmiboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kmii.kmiboard.entity.Question;
import com.kmii.kmiboard.repository.QuestionRepository;

@SpringBootTest
public class Test01 {
	
	@Autowired
	private QuestionRepository questionRepository;
	
//	@Test
//	@DisplayName("question 테이블에 질문글 저장하기")
//	public void testJpa1() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?"); //질문 제목
//		q1.setContent("sbb에 대해 알고 싶습니다"); // 질문 내용
//		q1.setCreatedate(LocalDateTime.now()); // 현재 시간 넣기
//		//q1 -> entity 생성 완료
//		questionRepository.save(q1);
//		
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델이 무엇인가요?"); //질문 제목
//		q2.setContent("id는 자동 생성되는게 맞나요"); // 질문 내용
//		q2.setCreatedate(LocalDateTime.now()); // 현재 시간 넣기
//		//q1 -> entity 생성 완료
//		questionRepository.save(q2);		
//		
//		
//	}
	
	@Test
	@DisplayName("모든 질문글 조회하기")
	public void testJpa2() {
		List<Question> allQuestion = questionRepository.findAll(); //모든 질문글 조회하기 , findAll은 repository에 따로 만들지 않아도됨
		assertEquals(2, allQuestion.size());  // 예상 결과 확인하기
		
	}
	

}
