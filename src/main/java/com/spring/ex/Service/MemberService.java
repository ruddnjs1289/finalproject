package com.spring.ex.Service;

import com.spring.ex.dto.Member;

public interface MemberService {
	//ȸ������
	public void register(Member vo) throws Exception;
	
	
	 //�α��� 
	 public Member login(Member vo) throws Exception;
	 
	
	
	
	
	//���̵� Ȯ��
	public int idCheck(Member vo) throws Exception;
}