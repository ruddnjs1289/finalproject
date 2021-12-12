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
	
	//회원가입
	@Override
	public void register(Member vo) throws Exception {
		dao.register(vo);
	}
	
	
	//로그인
	  @Override 
	  public Member login(Member vo) throws Exception {
	  
	   return dao.login(vo); 
	 }
	
	//아이디 중복체크
	@Override
	public Member idCheck(String id) throws Exception {
		
		return dao.idCheck(id);
		
	}


	@Override
	public void delete(Member vo) throws Exception {
		dao.delete(vo);
	}

	
	
	 
}
