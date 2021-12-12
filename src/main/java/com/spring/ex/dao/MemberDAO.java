package com.spring.ex.dao;

import com.spring.ex.dto.Member;

public interface MemberDAO {
	
	//ȸ������
	public void register(Member vo) throws Exception;
	
	 //�α��� 
	public Member login(Member vo) throws Exception;
	 
	//���̵� Ȯ��
	public Member idCheck(String id) throws Exception;
	
	//ȸ��Ż��
	public void delete(Member vo) throws Exception;
	
	

}
