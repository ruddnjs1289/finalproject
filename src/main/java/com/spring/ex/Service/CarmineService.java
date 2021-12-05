package com.spring.ex.Service;

import java.util.List;

import com.spring.ex.dto.Carmine;

public interface CarmineService {
	
	//게시글 목록
	public List<Carmine> list() throws Exception;
	
	//게시글 작성
	public void Write(Carmine vo) throws Exception;
	
	//게시글 조회
	public Carmine view(int bno) throws Exception;
	
	//게시글 수정
	public void Modify(Carmine vo) throws Exception;

}
