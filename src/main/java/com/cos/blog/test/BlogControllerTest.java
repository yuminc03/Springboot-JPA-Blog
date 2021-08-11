package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는게 아니라
//특정 annotation이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해줌.
public class BlogControllerTest {
	
	//http://localhost:8090/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
