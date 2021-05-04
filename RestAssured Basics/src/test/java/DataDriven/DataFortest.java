package DataDriven;

import org.testng.annotations.DataProvider;

public class DataFortest {

	@DataProvider(name="AdditionOfPeople")
	public   Object[][] dataforpost()
	{
		//its like hardcoding here
		
//		 Object[][] data= new Object[3][2];
//		 
//		 data[0][0]="Neha";
//		 data[0][1] ="Devops";
//		 
//		 data[1][0]="Mohini";
//		 data[1][1] ="Dev";
//		 
//		 data[2][0]="Mohan";
//		 data[2][1] ="Qa";
//		 
		 //return data;
	
		return new Object[][] {
			{"parikshit", "Engg"} ,
			{"Aditya", "MechEngg"}
			
		};
		
		
		
		
		}
	}
	

