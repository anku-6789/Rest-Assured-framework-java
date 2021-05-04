package utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.github.fge.jsonschema.main.cli.Main;

//hmac conversion stands for hash based message authentication code which involves for calculating message  authentication code involving hash function in combination with secret key
//it can b used as  verifying the integrity authenticity of message
//used in highly confidential data or payment related method
 //e.g AWS message/ aws id/ there is format //content md5//standard of facinf the data/content type/using current timezone/
public class HMAC_conversion {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
		
	
	//there are certain standard how we are sending data like sha256 or MD5;
	
		// need to convert secret and message into hmac format
	String serect ="admin";
	String message="Hello foolks, this is HMAC message";
	//need to create instance of hmac like here we used sha256
	
	Mac sha256=Mac.getInstance("HmacSHA256");//need to convert it into bytes
	
	
	SecretKeySpec s_key= new  SecretKeySpec(serect.getBytes(),"HmacSHA256") ;//here it comes under secretspec bytes here using algorithm HmacSHA256
	sha256.init(s_key);//need to initialize  with secret key
	
	
	//need to import apache commons io dependency to convert into base 64
	
	//need to encode into base 64 and my string is my message and again into bytes and stoes as hs valures 
	
	 String hash=Base64.encodeBase64String(sha256.doFinal(message.getBytes()));
	
	
	System.out.println("Hash valur is ::"+hash);
	
	
	
}
	
	
	
}