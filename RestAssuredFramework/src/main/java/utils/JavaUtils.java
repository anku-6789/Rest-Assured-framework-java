package utils;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

//this class is for java repetitive code
public class JavaUtils {
	
	
	public static  String randomNo()
	{
		
		Random random = new Random();
		int randomNo = random.nextInt(1000);// here we are passing id as string so we need to change
		String id = Integer.toString(randomNo);
     return id ;
		
	}
	
	 public static  String randomFirstName()
	 {
		 
		 String randomFirstname=RandomStringUtils.randomAlphabetic(8);
		return randomFirstname;
		 
	 }
	
	

	 public static  String randomLastName()
	 {
		 
		 String randomLastname=RandomStringUtils.randomAlphabetic(15);
		return randomLastname;
		 
	 }  
	 public static String randomSubjectid()
	 {
			Random ran = new Random();
			int randomNo1 = ran.nextInt(100);// here we are passing id as string so we need to change
			String Subjectid = Integer.toString(randomNo1);
			
		 return Subjectid;
		 
	 }
	 
	 
	

}
