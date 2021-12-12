package com.spring.ex.dao;

import com.spring.ex.dto.Member;

public interface MemberDAO {
	
	//회원가입
	public void register(Member vo) throws Exception;
	
	 //로그인 
	public Member login(Member vo) throws Exception;
	 
	//아이디 확인
	public Member idCheck(String id) throws Exception;
	
	//회원탈퇴
	public void delete(Member vo) throws Exception;
	
	

}
