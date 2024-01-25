package com.callor.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.models.StudentDto;
import com.callor.hello.service.HomeService;

// 여기는 Controller 클래스 이다
@Controller
public class HomeController {
	
	/*
	 * 컴포넌트 자동으로 주입받기
	 * 컴포넌트 클래스를  사용하여 객체를 "선언 만" 하고
	 * 생성자를 통하여 컴포넌트 객체를 주입받아 생성(초기화)한다
	 * Spring Framework 에 의해 준비된 컴포넌트는 필요한 곳에서
	 * 선언만 하면 자동으로 주입이 된다
	 * DI(Dependency Inject, 의존성 주입)
	 * 생성자를 통해서 주입받을 객체는 final 키워드를 부착하여 선언한다
	 * 
	 * 제어의 역전
	 * 일반적인 자바 코드에서 어떤 클래스를 사용하여 만든 
	 * 객체의 method 나 속성(변수)에 접근하기 위해서는 반드시
	 * 객체를 선언하고 생성자를 통하여 객체를 생성(초기화)해야 한다
	 * 그렇지 않으면 NullpointerException 이 발생한다
	 * Class class = new Class() 와 같은 코드를 사용하여 사용할 곳에서
	 * 객체를 생성하여 준비한다.
	 * 
	 * Spring Project 에서는 그러한 절차가 없이 필요하다 라는 선언만 하면
	 * Spring Container 에 미리 준비된 컴포넌트(객체, bean)를 주입해 준다
	 * 객체를 생성하는 방향이 일반 자바와 반대라는 의미로 
	 * "제어의 역전(Inverted of Control)" 이라고 한다
	 * 
	 * Spring Project 에서는 new 키워드를 사용하는 경우가 많지 않다
	 */
	private final HomeService homeService;
	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		homeService.hello();
		return "home";
	}
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String student(Model model) {
		StudentDto stDto = homeService.getStudent();
		/*
		 * STD = stDto 형식으로 변수를 만들고
		 * 그 변수를 model 객체에 추가하라
		 */
		model.addAttribute("STD",stDto);
		return "student";
	}
	
	
	
}
