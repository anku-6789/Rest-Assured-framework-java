package apibuilder;

import java.util.HashMap;
import java.util.Map;

public class PostApBuilder {

	//here it is like hardcomding the value when we try next time we will get error as insertion error failed becaise dulicate id
//	public Map<String,String> postrequestbody ()
//	{
//		
//		Map<String,String> body= new HashMap<String,String>();
//		body.put("id", "12");
//		body.put("FirstName", "Angha");
//		body.put("LastName", "patil");
//		body.put("SubjectId", "11");
//		
//		
//		return body;
//		
//	}
	
	public Map<String,String> postrequestbody (String id, String Firstname, String Lastname,String Subjectid)
	{
		
		Map<String,String> body= new HashMap<String,String>();
		body.put("id", id);
		body.put("FirstName", Firstname);
		body.put("LastName", Lastname);
	body.put("SubjectId", Subjectid);
	
		
		return body;
		
	}
	
	
}
