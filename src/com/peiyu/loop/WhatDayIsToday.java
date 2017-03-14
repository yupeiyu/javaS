package com.peiyu.loop;

public class WhatDayIsToday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7/1 Fri, so what day is Today
		
		int month=11;
		int day=22;
		String weekday[]={"Fri","Sat","Sun","Mon","Tue","Wed","Thr"};
		int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int th=0;
		
		for(int i=0;i<month-1;i++){
			th+=months[i];
		}
		th+=day;
		System.out.println(th);
		int weekdays=th%7;//當餘數=0,當日禮拜五,用餘數當作星期的index
		System.out.println(weekdays);
		System.out.print(weekday[weekdays]);
	}

}
