package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //getter, setter 둘 다 만들기
//@AllArgsConstructor //생성자 만들기
@NoArgsConstructor //빈 생성자 만들기
//@Getter  //getter만들기
//@Setter  //setter만들기
//@RequiredArgsConstructor //final이 있는 객체들의 constructor를 만들어줌
public class Member {
	private int id; //private으로 변수에 접근하는 것을 막음. 메서드만으로 접근할 수 있도록 함
	private String username;
	private String password;
	private String email;
	
	@Builder //객체를 만들 때 자동으로 1씩 증가하는 시퀸스를 넣고 싶다면 
	//Member 생성자가 하나 더 만들어져야한다
	//하지만 Builder 패턴을 쓰면 Member.builder().username();식으로 넣을 수 있다
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
//	public Member(int id, String username, String password, String email) {
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.email = email;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
}
