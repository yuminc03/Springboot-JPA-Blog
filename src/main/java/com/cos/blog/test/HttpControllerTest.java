package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일)
//@Controller

//사용자가 요청할 때 응답(Data)을 한다
@RestController //문자 그 자체를 리턴할 때 사용하는 annotation
public class HttpControllerTest {
	
	private static final String TAG = "HttpControllerTest : ";
	
	//localhost:8090/blog/http/lombok
	@GetMapping("/http/lombok")
	public String lombokTest() {
		//Member m = new Member(1, "ssar", "1234", "email");//@AllArgsConstructor로 생성자가 있기 때문에 가능함
		Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
		System.out.println(TAG + "getter: " + m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG + "setter: " + m.getUsername());
		return "lombok test 완료!";//문자 자체를 리턴
	}

	//인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다
	//http://localhost:8090/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {//?id=1&username=ssar&password=1234&email=ssar@nate.com
		
		return "get 요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
	}
	//@RequestParam : 1개의 HTTP 요청 파라미터를 받기 위해 사용함 (예)@RequestParam int id
	
	//http://localhost:8090/http/post (insert)
	//요청할 때 postman x-www.form.urlencoded에 id, username, pass, email을 입력해도 응답받을 수 있음
	@PostMapping("http/post")//text/plain(raw 데이터), application/json
	public String postTest(@RequestBody Member m) { //MessageConverter(스프링부트)
		return "post 요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
	}
	//@RequestBody : 클라이언트가 전송하는 Json(application/json) 형태의 HTTP Body 데이터를 Java Object로 변환시켜주는 역할
	//MessageConverter(스프링부트)는 application/json으로 요청하면 Member m에 매핑해서 넣어줌
	
	//http://localhost:8090/http/put (update)
	@PutMapping("http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
	}
	
	//http://localhost:8090/http/delete (delete)
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
}
