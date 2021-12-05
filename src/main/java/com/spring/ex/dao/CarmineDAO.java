package com.spring.ex.dao;

import java.util.List;

import com.spring.ex.dto.Carmine;

public interface CarmineDAO {
	
	//�Խù� ���
	public List<Carmine> list() throws Exception;
	
	//�Խù� �ۼ�
	public void Write(Carmine vo) throws Exception;
	
	//�Խù� ��ȸ
	public Carmine view(int bno) throws Exception;
	
	//�Խù� ����
	public void Modify(Carmine vo) throws Exception;

}
