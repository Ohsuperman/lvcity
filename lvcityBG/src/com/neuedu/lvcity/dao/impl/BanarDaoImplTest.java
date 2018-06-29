package com.neuedu.lvcity.dao.impl;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.model.Banar;

public class BanarDaoImplTest {
 

	@Test
	public void testBanarCount() {
		Connection conn = DBUtils.getConnection();
		BanarDaoImpl banardaoimpl= new BanarDaoImpl(conn);
		
		System.out.println(banardaoimpl.banarCount());
	}

}
