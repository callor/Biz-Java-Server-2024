package com.callor.hello.service;

import org.springframework.stereotype.Service;

import com.callor.hello.models.StudentDto;

/*
 * 클래스에 Annotation(@Component..)이 부착이 되면
 * 이 클래스는 컴포넌트(Component)가 된다
 * Spring Project 가 시작될때 모든 컴포넌트들은 자동으로 scan 되어
 * bean 으로 생성된 후 Spring Container 에 보관된다
 */

@Service
public class HomeService {
	public void hello() {
		System.out.println("안녕하세요");
	}
	
	public StudentDto getStudent() {
		StudentDto stDto = new StudentDto();
		stDto.setStNum("0001");
		stDto.setStName("홍길동");
		stDto.setStGrade("3");
		return stDto;
	}
	
	
	
	
	
	
	
}
