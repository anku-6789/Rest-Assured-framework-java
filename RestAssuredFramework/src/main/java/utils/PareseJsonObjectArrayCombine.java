package utils;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class PareseJsonObjectArrayCombine {

	
	//json for reffer
//	{
//		  "Data": [
//		    {
//		      "id": "56",
//		      "Name": "Browni",
//		      "Categeroy": "snack",
//		      "Method of Delivery": "Curbside",
//		      "Ingredients": [
//		        {
//		          "Name": "refined wheat"
//		        },
//		        {
//		          "Name": "Sugar"
//		        },
//		        {
//		          "Name": "CocoPowder"
//		        }
//		      ]
//		    },
//		    {
//		      "id": "56",
//		      "Name": "Cake",
//		      "Categeroy": "snack",
//		      "Method of Delivery": "Curbside",
//		      "Ingredients": [
//		        {
//		          "Name": "refined maida"
//		        },
//		        {
//		          "Name": "jaggary"
//		        },
//		        {
//		          "Name": "CocoPowder And Essence"
//		        }
//		      ]
//		    }
//		  ]
//		}
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
							
							
						}else if (json.get(nextkeys) instanceof JSONArray)//if its json array then enter into array loop
						{
							JSONArray jsonarray = json.getJSONArray(nextkeys);// we  are passing tje value to next string
							for(int i=0;i<jsonarray.length();i++){
								
								
							String jsonArrayString	=jsonarray.get(i).toString();//json array converting into string and storeing it 
							JSONObject innerJson= new JSONObject(jsonArrayString);//converting jsonarray  string to json
								
							
							if(exist ==false){//still here exist value is not present 
								getkey(innerJson,key);
								
							}
							
							
							}
							
							
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
				+ "	\"Data\": [{\n"
				+ "			\"id\": \"56\",\n"
				+ "			\"Name\": \"Browni\",\n"
				+ "			\"Categeroy\": \"snack\",\n"
				+ "			\"Method of Delivery\": \"Curbside\",\n"
				+ "			\"Ingredients\": [{\n"
				+ "					\"name\": \"refined wheat\"\n"
				+ "				},\n"
				+ "				{\n"
				+ "					\"name\": \"Sugar\"\n"
				+ "				},\n"
				+ "				{\n"
				+ "					\"name\": \"CocoPowder\"\n"
				+ "				}\n"
				+ "			]\n"
				+ "		},\n"
				+ "		{\n"
				+ "			\"id\": \"56\",\n"
				+ "			\"Name\": \"Cake\",\n"
				+ "			\"Categeroy\": \"snack\",\n"
				+ "			\"Method of Delivery\": \"Curbside\",\n"
				+ "			\"Ingredients\": [{\n"
				+ "					\"name\": \"refined maida\"\n"
				+ "				},\n"
				+ "				{\n"
				+ "					\"name\": \"jaggary\"\n"
				+ "				},\n"
				+ "				{\n"
				+ "					\"name\": \"CocoPowder And Essence\"\n"
				+ "				}\n"
				+ "			]\n"
				+ "		}\n"
				+ "	]\n"
				+ "\n"
				+ "}";
		
		JSONObject inputjsonObj= new JSONObject(inputJson);//converting string into json
		
		
		//getkey(inputjsonObj,"policy no");
		
		getkey(inputjsonObj,"name");//now it will print the nam eof employee
	}
	
	
}
