package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.domain.GuildVO;


@Repository
public class GuildDAOImpl implements GuildDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace="com.spring.mappers.Guild";
	
	@Override
	public List<GuildVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace+".list");
	}

}
