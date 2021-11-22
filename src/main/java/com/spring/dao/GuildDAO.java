package com.spring.dao;

import java.util.List;

import com.spring.domain.GuildVO;

public interface GuildDAO {
	
	public List<GuildVO> list() throws Exception;

}
