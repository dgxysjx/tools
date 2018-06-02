package com.oracle.test;

import java.util.Calendar;
import java.util.Date;


public class DataUtils {
	/**
	 * 指定时间换算年
	 * @param Date time
	 * @param int months
	 * @return Date
	 */
	public static Date cal_year(Date time,int year) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time);  
        cl.add(Calendar.YEAR, year);  
        return cl.getTime();  
	}
	/**
	 * 指定时间换算月
	 * @param time
	 * @param month
	 * @return Date
	 */
	public static Date cal_month(Date time,int month) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time);  
        cl.add(Calendar.MONTH, month);  
        return cl.getTime();  
	}
	
	/**
	 * 指定时间换算天
	 * @param time
	 * @param day
	 * @return Date
	 */
	public static Date cal_day(Date time,int day) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time);  
        cl.add(Calendar.DAY_OF_MONTH, day);  
        return cl.getTime();  
	}
	
	
	/**
	 * 指定时间换算小时
	 * @param time
	 * @param hour
	 * @return
	 */
	public static Date cal_hour(Date time,int hour) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time);  
        cl.add(Calendar.HOUR, hour);  
        return cl.getTime();  
	}
	
	/**
	 * 指定时间换算分钟
	 * @param time
	 * @param minute
	 * @return Date
	 */
	public static Date cal_minute(Date time,int minute) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time);  
        cl.add(Calendar.MINUTE, minute);  
        return cl.getTime();  
	}
	
	/**
	 * 获取指定时间的年份
	 * @param time
	 * @return int
	 */
	public static int  get_year(Date time) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time); 
		return cl.get(Calendar.YEAR); 
	}
	
	/**
	 * 获取指定时间的月份
	 * @param time
	 * @return int
	 */
	public static int  get_month(Date time) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time); 
		return cl.get(Calendar.MONTH)+1; 
	}
	
	/**
	 * 获取指定时间为几号
	 * @param time
	 * @return int
	 */
	public static int  get_day(Date time) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time); 
		return cl.get(Calendar.DAY_OF_MONTH); 
	}
	
	/**
	 * 获取指定时间为周几
	 * 周日-1
	 * 周一-2
	 * 周二-3
	 * 周三-4
	 * 周四-5
	 * 周五-6
	 * 周六-7
	 * @param time
	 * @return int
	 */
	public static int  get_week(Date time) {
		Calendar cl = Calendar.getInstance();  
        cl.setTime(time); 
		return cl.get(Calendar.DAY_OF_WEEK); 
	}
	
	
	
	
}
