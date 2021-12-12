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

	//게시물  삭제
	public void Delete(int bno) throws Exception;
	
	//게시물 총 갯수
	public int Count() throws Exception;
	
	// 게시물 목록 + 페이징
	/*
	 * public List<Carmine> listPage(int displayPost, int postNum) throws Exception;
	 */
	
	public List<Carmine> listPage(int displayPost, int postNum, String searchType,String keyword) throws Exception;
	
	//게시물 총 갯수+검색 전용
	 public int searchCount(String searchType, String keyword) throws Exception;
	 
	 //게시글 조회수
	 public void plusCnt(int bno)throws Exception;
}
