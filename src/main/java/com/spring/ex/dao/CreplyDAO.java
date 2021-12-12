package com.spring.ex.dao;

import java.util.List;

import com.spring.ex.dto.Creply;

public interface CreplyDAO {
	
	// ´ñ±Û Á¶È¸
	public List<Creply> list(int bno) throws Exception;

	// ´ñ±Û ÀÛ¼º
	public void write(Creply vo) throws Exception;

	// ´ñ±Û ¼öÁ¤
	public void modify(Creply vo) throws Exception;

	// ´ñ±Û »èÁ¦
	public void delete(Creply vo) throws Exception;

}
