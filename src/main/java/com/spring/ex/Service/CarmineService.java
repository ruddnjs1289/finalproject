package com.spring.ex.Service;

import java.util.List;

import com.spring.ex.dto.Carmine;

public interface CarmineService {

	// 게시글 목록
	public List<Carmine> list() throws Exception;

	// 게시글 작성
	public void Write(Carmine vo) throws Exception;

	// 게시글 조회
	public Carmine view(int bno) throws Exception;
	

	// 게시글 수정
	public void Modify(Carmine vo) throws Exception;

	// 게시글 삭제
	public void Delete(int bno) throws Exception;

	// 게시글 총 개수
	public int Count() throws Exception;

	/*
	 * //게시물 목록 +페이징 public List<Carmine> listPage(int displayPost, int postNum)
	 * throws Exception;
	 */

	// 게시물 목록 +페이징 + 검색
	public List<Carmine> listPage(int displayPost, int postNum, String searchType, String keyword) throws Exception;

	
	 // 게시물 총 갯수 + 검색 적용 
	public int searchCount(String searchType, String keyword)throws Exception;
	
	// 게시물 조회수
	public void plusCnt(int bno)throws Exception;
	 
}
