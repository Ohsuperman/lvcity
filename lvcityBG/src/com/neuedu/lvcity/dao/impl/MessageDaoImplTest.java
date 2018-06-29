package com.neuedu.lvcity.dao.impl;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

import com.neuedu.lvcity.common.DBUtils;

public class MessageDaoImplTest {


	@Test
	public void testMessageCount() {
		Connection conn =  DBUtils.getConnection();
		MessageDaoImpl mdi = new MessageDaoImpl(conn);
		System.out.println(mdi.messageCount());
	}

}
