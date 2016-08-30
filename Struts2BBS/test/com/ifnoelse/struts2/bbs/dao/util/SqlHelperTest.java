package com.ifnoelse.struts2.bbs.dao.util;

import java.sql.Connection;

import org.junit.Test;

public class SqlHelperTest {

	@Test
	public void test() {
		Connection conn = SqlHelper.Connect();
	}

}
