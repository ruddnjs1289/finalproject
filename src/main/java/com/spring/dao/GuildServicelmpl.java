package com.spring.dao;



import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.domain.GuildVO;

@Service
public class GuildServicelmpl  implements GuildDAO{
	
	@Inject
	private GuildDAO dao;
	
	@Override
	public List<GuildVO> list() throws Exception{
		return dao.list();
	}
	

}
