package com.spring.ex.daoImpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.spring.ex.dao.CarmineDAO;
import com.spring.ex.dto.Carmine;

@Repository
public class CarmineDAOImpl implements CarmineDAO{

	@Inject
	private SqlSession sql;
	
	private static String namespace="CarmineMapper";
	
	private static String a= "CarmineMapper.view";
	
	private static String md= "CarmineMapper.modify";
	
	
	//�Խù� ���
	@Override
	public List<Carmine> list() throws Exception {
		
		return sql.selectList(namespace+".list");
	}

	//�Խù� �ۼ�
	@Override
	public void Write(Carmine vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace+".Write",vo);
		
	}

	//�Խù���ȸ 
	@Override
	public Carmine view(int bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(sql.selectOne(a,bno));
		return sql.selectOne(namespace+".view",bno);
	}

	//�Խñ� ����
	@Override
	public void Modify(Carmine vo) throws Exception {
		System.out.println(sql.update(md,vo));
		sql.update(namespace+".modify",vo);
		
	}
	
	

}
