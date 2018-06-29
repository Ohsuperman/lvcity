package com.neuedu.lvcity.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.lvcity.model.Articaltype;

public interface ArticaltypeDao {

	public int articaltypeCount();
	public List<Articaltype> findAllArticaltype(Map<String, Object> map);
	public int addArticaltype(String atype);
	public int upateArticaltype(Articaltype articaltype);
	public int deteleArticaltype(Articaltype articaltype);
	public Articaltype findOneArticaltype(Articaltype articaltype);
}
