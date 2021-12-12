package com.spring.ex.Service;

import java.util.List;


import com.spring.ex.dto.Creply;

public interface CreplyService {
	
	public List<Creply> list(int bno) throws Exception;

	
	public void write(Creply vo) throws Exception;

	
	public void modify(Creply vo) throws Exception;

	
	public void delete(Creply vo) throws Exception;

}
