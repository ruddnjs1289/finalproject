package com.spring.ex.daoImpl;

import java.util.List;

import javax.inject.Inject;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.dao.CreplyDAO;
import com.spring.ex.dto.Creply;

@Repository
public class CreplyDAOImpl implements CreplyDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace ="CreplyMapper";
	
	@Override
	public List<Creply> list(int bno) throws Exception {
		
		return sql.selectList(namespace+".replyList",bno);
	}

	@Override
	public void write(Creply vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace+".replyWrite",vo);
	}

	@Override
	public void modify(Creply vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace+".replyModify",vo);
		
	}

	@Override
	public void delete(Creply vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace+".replyDelete",vo);
		
	}

}
