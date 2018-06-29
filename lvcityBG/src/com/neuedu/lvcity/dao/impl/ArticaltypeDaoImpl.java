package com.neuedu.lvcity.dao.impl;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.neuedu.lvcity.dao.ArticaltypeDao;
import com.neuedu.lvcity.model.Articaltype;

public class ArticaltypeDaoImpl implements ArticaltypeDao{

	/*
	 * 数据库连接
	 * 
	 * */

	private Connection conn;
	
	@Override
	public int articaltypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Articaltype> findAllArticaltype(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addArticaltype(String atype) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int upateArticaltype(Articaltype articaltype) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deteleArticaltype(Articaltype articaltype) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Articaltype findOneArticaltype(Articaltype articaltype) {
		// TODO Auto-generated method stub
		return null;
	}

}
