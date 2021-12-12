package com.spring.ex.ServiceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.ex.Service.CreplyService;
import com.spring.ex.dao.CreplyDAO;
import com.spring.ex.dto.Creply;



@Service
public class CreplyServiceImpl implements CreplyService {

	@Inject
	private CreplyDAO dao;
	
	@Override
	public List<Creply> list(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(bno);
	}

	@Override
	public void write(Creply vo) throws Exception {
		dao.write(vo);
		
	}

	@Override
	public void modify(Creply vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
		
	}

	@Override
	public void delete(Creply vo) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(vo);
		
	}

	

}
