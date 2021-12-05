package com.spring.ex.dao;

import java.util.List;

import com.spring.ex.dto.Carmine;

public interface CarmineDAO {
	
	//게시물 목록
	public List<Carmine> list() throws Exception;
	
	//게시물 작성
	public void Write(Carmine vo) throws Exception;
	
	//게시물 조회
	public Carmine view(int bno) throws Exception;
	
	//게시물 수정
	public void Modify(Carmine vo) throws Exception;

}
