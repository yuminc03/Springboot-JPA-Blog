package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일)
//@Controller

//사용자가 요청할 때 응답(Data)을 한다
@RestController
public class HttpControllerTest {

	//인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다
	//http://localhost:8090/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword();
	}
	//@RequestParam : 1개의 HTTP 요청 파라미터를 받기 위해 사용함 (예)@RequestParam int id
	
	//http://localhost:8090/http/post (insert)
	@PostMapping("http/post")
	public String postTest() {
		return "post 요청";
	}
	
	//http://localhost:8090/http/put (update)
	@PutMapping("http/put")
	public String putTest() {
		return "put 요청";
	}
	
	//http://localhost:8090/http/delete (delete)
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
}
