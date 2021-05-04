package utils;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class PareseDynamicNestedJSon {

	//how to parse Dynamoc json?
	//how to parese nested  json?
	
	
	
	
	// to get the key creating method
	
	public static void PareseObj(JSONObject json,String key )
	{
		//System.out.println(json.has(key));/so here it will print the policy no in output
		System.out.println(json.get(key));//so here it will print the policy no in output 
	}
	
	
	public static  void getkey(JSONObject json,String key )
	{
		
		 boolean exist =json.has(key);//if key it exist or not that isCompany Name if yes we are storing it into boolean format
		 
		 Iterator<?>keys;//genreic concept//storing the keys into interator
		 String nextkeys;
		
		if(!exist)
		{
			keys=json.keys();//storying the key value into keys now
			while(keys.hasNext())//iterating all the json keys  iterating
			{
				nextkeys=(String)keys.next();//keys now casting into string //storing the first key
				
					try {
						
						if(json.get(nextkeys) instanceof JSONObject){
							
							if(exist ==false){//still here exist value is not present 
								getkey(json.getJSONObject(nextkeys),key);
								
							}
							
							
						}else if (json.get(nextkeys) instanceof JSONArray)
						{
							
						}
						
						
					
				}
					catch(Exception e)
				{
					//to handle the exception
						System.out.println("Opps here.Exception Founde");
				}
			}
			
			
		}else
		{
			PareseObj(json,key);//here it will print the policy no
			//if here in key value  if i used name then fail because we have not written the code
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String  inputJson= "{\n"
				+ "\n"
				+ "	\"Company Name\": \"Tata consultancy\",\n"
				+ "	\"Company branch\": \"pune\",\n"
				+ "	\"policy no\": \"45353453453\",\n"
				+ "	\"employee\": {\n"
				+ "		\"name\": \"sonoo\",\n"
				+ "		\"salary\": 56000,\n"
				+ "		\"married\": true\n"
				+ "	}\n"
				+ "}";
		
		JSONObject inputjsonObj= new JSONObject(inputJson);//converting string into json
		
		
		//getkey(inputjsonObj,"policy no");
		
		getkey(inputjsonObj,"name");
	}
	
	
}
