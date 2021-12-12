package com.spring.ex.daoImpl;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.spring.ex.dao.CarmineDAO;
import com.spring.ex.dto.Carmine;

@Repository
public class CarmineDAOImpl implements CarmineDAO{

	//���ۿ� ���Ͼ� ���̵�����
	
	@Inject
	private SqlSession sql;
	
	private static String namespace="CarmineMapper";
	
	private static String a= "CarmineMapper.view";
	
	private static String md= "CarmineMapper.modify";
	
	private static String count="CarmineMapper.count";
	
	private static String viewcnt="CarmineMapper.Viewcnt";
	
	
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

	//�Խñ� ����
	@Override
	public void Delete(int bno) throws Exception {
		sql.delete(namespace+".delete",bno); 
		
	}

	//�Խù� �� ����
	@Override
	public int Count() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(count+"Ȯ�ο�");
		return sql.selectOne(namespace+".count");
	}

	//�Խù� ���+����¡
	
	/*
	 * @Override public List<Carmine> listPage(int displayPost, int postNum) throws
	 * Exception {
	 * 
	 * HashMap<String,Integer> data =new HashMap<String,Integer>();
	 * 
	 * data.put("displayPost", displayPost); data.put("postNum",postNum);
	 * 
	 * return sql.selectList(namespace+".listPage",data); }
	 */

	
	@Override
	public List<Carmine> listPage(int displayPost, int postNum, String searchType, String keyword) throws Exception {
		
		HashMap<String,Object> data =new HashMap<String,Object>();
		  
		 data.put("displayPost", displayPost); 
		 data.put("postNum",postNum);
		 
		 data.put("searchType",searchType);
		 data.put("keyword",keyword);
		 
		return sql.selectList(namespace+".listPage",data);
	}

	//�Խù� �� ���� +�˻� ����
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		
		HashMap<String,Object> data =new HashMap<String, Object>();
		
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		
		return sql.selectOne(namespace+".searchCount",data);
	}

	//��ȸ�� 
	@Override
	public void plusCnt(int bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(sql.update(viewcnt));
		sql.update(viewcnt);
	}

	

	
	

}
