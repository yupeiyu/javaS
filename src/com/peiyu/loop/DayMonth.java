package com.peiyu.loop;

public class DayMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int [] months={31,28,31,30,31,30,31,31,30,31,30,31};
	 int month=7;
	 int day=8;
	 int th=0;
	 
	 for(int i=0;i<month-1;i++){
		
		 th+=months[i];
	 }
	 th+=day;

	 String msg=" ";
	 switch(th){
	
	case 1:
		msg="st";
		break;
	case 2:
		msg="nd";
		break;
	case 3:
    	msg="rd";
		break;
	default:
	   msg="th";	
	
}
	 System.out.print(month+"."+day+" is the "+th+msg+" day of a year");
	 
	}


}
