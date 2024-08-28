package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception {
		long currentTime = System.currentTimeMillis();
		System.out.println("System.currentTimeMillis():"+currentTime);
		long startTime = System.currentTimeMillis();
		Thread.sleep(12);
		long endTime = System.currentTimeMillis();
		long duration=endTime-startTime;
		System.out.println("duration:"+duration+"ms");
		Date now=new Date();
		String nowString=now.toString();
		System.out.println(nowString);
		long currentTimeMillis1=now.getTime();
		System.out.println("Date.getTime()==>"+currentTimeMillis1);
		
		System.out.println("------------SimpleDateFormat[Date-->String]---------");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy 년 MM 월 dd 일"); 
		String formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf1.format(now));
		sdf1.applyPattern("yyyy");
		System.out.println(sdf1.format(now));
		
		
		System.out.println("------------SimpleDateFormat[String-->Date]---------");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date mybirthday = sdf2.parse("2000-06-02");
		System.out.println(mybirthday.toString());
		System.out.println(mybirthday.toLocaleString());
		System.out.println(mybirthday.getTime());
		
		Date yourBirthDay = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("1999/05/20 18:11:13");
		System.out.println(yourBirthDay.toString());
		System.out.println(yourBirthDay.toLocaleString());
		System.out.println(yourBirthDay.getTime());
		
		System.out.println("------------Date객체메쏘드----------");
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-03");
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-03");
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2024-01-15");
		System.out.println("date1.equals(date2) : "+date1.equals(date2));
		System.out.println("date1.equals(date3) : "+date1.equals(date3));
		System.out.println("date1.compareTo(date2) : "+date1.compareTo(date2));
		System.out.println("date1.compareTo(date3) : "+date1.compareTo(date3));
		System.out.println("date3.compareTo(date1) : "+date3.compareTo(date1));
		
		System.out.println("--------java.util.Date <--> java.sql.Date--------");
		java.util.Date utilDate1 = new java.util.Date();
		java.util.Date utilDate2 = new java.util.Date(System.currentTimeMillis());
		java.util.Date utilDate3 = new SimpleDateFormat("yyyy/MM/dd").parse("2024/08/08");
		
		java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
		java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
		java.sql.Date sqlDate3 = new java.sql.Date(utilDate3.getTime());
		
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		System.out.println(sqlDate3);
		
		System.out.println("--------java.sql.Date <--> java.util.Date--------");
		
		java.sql.Date sqlDate4 = new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate5 = new java.sql.Date(new SimpleDateFormat("yyyy/MM/dd").parse("2020/11/25").getTime());
		
		java.util.Date utilDate4 = new java.util.Date(sqlDate4.getTime());
		java.util.Date utilDate5 = sqlDate5;
		
		
		
		
		
		
		
		
		
		
		
	}

}
