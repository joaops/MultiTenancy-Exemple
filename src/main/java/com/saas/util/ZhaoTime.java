package com.saas.util;

import java.sql.Date;

public class ZhaoTime {

	/**
	 * 获取当前的日期，能写入mysql的数据的格式(YYYY-MM-DD)
	 * @return 当前日期
	 */
	public static Date getCurrentDate(){
		return new Date(new java.util.Date().getTime());
	}
}
