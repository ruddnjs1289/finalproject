package com.spring.ex.ServiceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.ex.Service.CarmineService;
import com.spring.ex.dao.CarmineDAO;
import com.spring.ex.dto.Carmine;


@Service
public class CarmineServiceImpl  implements CarmineService{

	@Inject
	private CarmineDAO dao;
	
	//���
	@Override
	public List<Carmine> list() throws Exception {
		
		return dao.list();
	}

	//�ۼ�
	@Override
	public void Write(Carmine vo) throws Exception {
		dao.Write(vo);
		
	}

	
	//��ȸ
	@Override
	public Carmine view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}

	
	//����
	@Override
	public void Modify(Carmine vo) throws Exception {
		dao.Modify(vo);
		
	}
	
	

}