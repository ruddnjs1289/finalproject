package com.spring.ex.Service;

import java.util.List;

import com.spring.ex.dto.Carmine;

public interface CarmineService {
	
	//�Խñ� ���
	public List<Carmine> list() throws Exception;
	
	//�Խñ� �ۼ�
	public void Write(Carmine vo) throws Exception;
	
	//�Խñ� ��ȸ
	public Carmine view(int bno) throws Exception;
	
	//�Խñ� ����
	public void Modify(Carmine vo) throws Exception;

}
