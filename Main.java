package Demo;


import java.util.*;
import java.text.*;


public class Main {
	
	public static boolean isDateValide(String strDate, String format) {
	    try {
	    	SimpleDateFormat sdf = new SimpleDateFormat(format);
	    	sdf.setLenient(false);
	    	sdf.parse(strDate);
	    	return true;
	    	
	} catch (Exception e) {
		return false;
		
		}
	}
	

	public static void main(String[] args) {
		
	//Get current date time
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("CurrentDate: " + sdf.format(currentDate));
		
		//Convert String to Date
		try {
			String strDate = "10/20/1985";
			SimpleDateFormat sdfBirthday = new SimpleDateFormat("MM/dd/yyyy");
			Date birthday = sdfBirthday.parse(strDate);
			SimpleDateFormat sdfBirthday1 = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Birthday: "+sdfBirthday1.format(birthday));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//using Calander
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		System.out.println("Year: " + c.get(Calendar.YEAR));
		System.out.println("Month: " + (c.get(Calendar.MONTH) +1));
		System.out.println("Day of Month: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour: " + c.get(Calendar.HOUR));
		System.out.println("Minutes: " + c.get(Calendar.MINUTE));
		System.out.println("Second " + c.get(Calendar.SECOND));
		
		//Check date validation
		if(isDateValide("10/01/1990", "MM/dd/yyyy"))
			System.out.println("Date is valid");
		else
			System.out.println("Date is invalid");
			
		
		
	}
}
	
	
	