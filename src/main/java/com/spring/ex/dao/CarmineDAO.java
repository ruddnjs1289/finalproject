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

	//�Խù�  ����
	public void Delete(int bno) throws Exception;
	
	//�Խù� �� ����
	public int Count() throws Exception;
	
	// �Խù� ��� + ����¡
	/*
	 * public List<Carmine> listPage(int displayPost, int postNum) throws Exception;
	 */
	
	public List<Carmine> listPage(int displayPost, int postNum, String searchType,String keyword) throws Exception;
	
	//�Խù� �� ����+�˻� ����
	 public int searchCount(String searchType, String keyword) throws Exception;
	 
	 //�Խñ� ��ȸ��
	 public void plusCnt(int bno)throws Exception;
}
