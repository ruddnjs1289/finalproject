package com.spring.ex.daoImpl;

import javax.inject.Inject;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
/*import org.springframework.stereotype.Service;*/

import com.spring.ex.dao.MemberDAO;
import com.spring.ex.dto.Member;


@Repository
public class MemberDAOImpl implements MemberDAO {
	
	//���� ��Ƽ��
	@Inject
	private SqlSession sql;
	
	//����
	private static String namespace ="MemberMapper";

	//ȸ������
	@Override
	public void register(Member vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace+".register", vo);
		
	}

	@Override
	public int idCheck(Member vo) throws Exception {
		int result =sql.selectOne(namespace+".idCheck",vo);
		return result;
	}

	
	 @Override 
	 public Member login(Member vo) throws Exception { 
		 return sql.selectOne(namespace+".login",vo); 
	}
	 



}
