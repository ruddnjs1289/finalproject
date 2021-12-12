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

	//매퍼와 동일안 아이디어야함
	
	@Inject
	private SqlSession sql;
	
	private static String namespace="CarmineMapper";
	
	private static String a= "CarmineMapper.view";
	
	private static String md= "CarmineMapper.modify";
	
	private static String count="CarmineMapper.count";
	
	private static String viewcnt="CarmineMapper.Viewcnt";
	
	
	//게시물 목록
	@Override
	public List<Carmine> list() throws Exception {
		
		return sql.selectList(namespace+".list");
	}

	//게시물 작성
	@Override
	public void Write(Carmine vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace+".Write",vo);
		
	}

	//게시물조회 
	@Override
	public Carmine view(int bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(sql.selectOne(a,bno));
		return sql.selectOne(namespace+".view",bno);
	}

	
	
	//게시글 수정
	@Override
	public void Modify(Carmine vo) throws Exception {
		System.out.println(sql.update(md,vo));
		sql.update(namespace+".modify",vo);
		
	}

	//게시글 삭제
	@Override
	public void Delete(int bno) throws Exception {
		sql.delete(namespace+".delete",bno); 
		
	}

	//게시물 총 갯수
	@Override
	public int Count() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(count+"확인용");
		return sql.selectOne(namespace+".count");
	}

	//게시물 목록+페이징
	
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

	//게시물 총 갯수 +검색 전용
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		
		HashMap<String,Object> data =new HashMap<String, Object>();
		
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		
		return sql.selectOne(namespace+".searchCount",data);
	}

	//조회수 
	@Override
	public void plusCnt(int bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(sql.update(viewcnt));
		sql.update(viewcnt);
	}

	

	
	

}
