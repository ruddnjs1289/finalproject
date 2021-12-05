package com.spring.ex.ServiceImpl;



import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.ex.Service.MemberService;
import com.spring.ex.dao.MemberDAO;
import com.spring.ex.dto.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO dao;
	
	//ȸ������
	@Override
	public void register(Member vo) throws Exception {
		dao.register(vo);
	}
	
	
	//�α���
	  @Override 
	  public Member login(Member vo) throws Exception {
	  
	   return dao.login(vo); 
	 }
	
	//���̵� �ߺ�üũ
	@Override
	public int idCheck(Member vo) throws Exception {
		int result =dao.idCheck(vo);
		return result;
		
	}

	
	
	 
}
