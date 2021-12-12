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

	//���̵� Ȯ��
	@Override
	public Member idCheck(String id) throws Exception {
		
		return sql.selectOne(namespace+".idCheck",id);
	}

	//�α���
	 @Override 
	 public Member login(Member vo) throws Exception { 
		 return sql.selectOne(namespace+".login",vo); 
	}

	@Override
	public void delete(Member vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace+".delete",vo);
		
	}
	 



}
