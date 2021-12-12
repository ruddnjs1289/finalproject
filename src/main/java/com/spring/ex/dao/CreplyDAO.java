package com.spring.ex.dao;

import java.util.List;

import com.spring.ex.dto.Creply;

public interface CreplyDAO {
	
	// ��� ��ȸ
	public List<Creply> list(int bno) throws Exception;

	// ��� �ۼ�
	public void write(Creply vo) throws Exception;

	// ��� ����
	public void modify(Creply vo) throws Exception;

	// ��� ����
	public void delete(Creply vo) throws Exception;

}
