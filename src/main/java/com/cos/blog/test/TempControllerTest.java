package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //파일을 리턴할 때 사용하는 annotation
public class TempControllerTest {
	
	//http://localhost:8090/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		//파일리턴 기본경로: src/main/resources/static
		//리턴명: /home.html
		//풀경로: src/main/resources/static/home.html
		return "/home.html";//statichome.html으로 하면 파일을 못찾아서 static/home.html식으로 경로를 만들어야함
		//@Controller가 해당경로 아래에 있는 파일을 리턴한다 (@RestController와 다름)
	}
	
	@GetMapping("/temp/img")
	public String tempImg() {
		return "/a.png";
	}
	
	@GetMapping("temp/jsp")
	public String tempJsp() {
		//prefix: /WEB-INF/views/
		//suffix: .jsp
		//풀네임: /WEB-INF/views/test.jsp
		
		return "test";
	}
}
