package com.spring.ex.ServiceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.ex.Service.CarmineService;
import com.spring.ex.dao.CarmineDAO;
import com.spring.ex.dto.Carmine;


@Service
public class CarmineServiceImpl  implements CarmineService{

	@Inject
	private CarmineDAO dao;
	
	//목록
	@Override
	public List<Carmine> list() throws Exception {
		
		return dao.list();
	}

	//작성
	@Override
	public void Write(Carmine vo) throws Exception {
		dao.Write(vo);
		
	}

	
	//조회
	@Override
	public Carmine view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}

	
	//갱신
	@Override
	public void Modify(Carmine vo) throws Exception {
		dao.Modify(vo);
		
	}

	@Override
	public void Delete(int bno) throws Exception {
		dao.Delete(bno);
		
	}

	//게시물 총 갯수
	@Override
	public int Count() throws Exception {
		// TODO Auto-generated method stub
		return dao.Count();
	}
	//게시물 +페이징
	/*
	 * @Override public List<Carmine> listPage(int displayPost, int postNum) throws
	 * Exception { // TODO Auto-generated method stub return
	 * dao.listPage(displayPost, postNum); }
	 * 
	 */
	
	@Override
	public List<Carmine> listPage(int displayPost, int postNum,String searchType,String keyword) throws Exception {
		// TODO Auto-generated method stub
		
		return dao.listPage(displayPost, postNum,searchType,keyword);
	}

	//게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		
		return dao.searchCount(searchType, keyword);
	}

	@Override
	public void plusCnt(int bno) throws Exception {
		// TODO Auto-generated method stub
		 dao.plusCnt(bno);
	}

	


	

	
	

}
