package com.spring.ex.Service;

import com.spring.ex.dto.Member;

public interface MemberService {
	//회원가입
	public void register(Member vo) throws Exception;
	
	
	 //로그인 
	 public Member login(Member vo) throws Exception;
	 
	
	
	
	
	//아이디 확인
	public int idCheck(Member vo) throws Exception;
}
