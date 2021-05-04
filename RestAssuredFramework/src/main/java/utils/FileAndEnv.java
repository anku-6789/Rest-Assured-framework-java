package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {

	public static Map<String, String> fileandenv = new HashMap<String, String>();

	public static Properties propmain = new Properties();// to read data from property file
	public static Properties propSet = new Properties();

	
	//created one static method here
	public static Map<String, String> envAndFile() {
		// to pass the particular env file

		String environment = System.getProperty("env");

		try {
			if (environment.equalsIgnoreCase("dev")) {
				FileInputStream fisdev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");
				propmain.load(fisdev);
				fileandenv.put("ServerUrl", propmain.getProperty("ServerUrl"));
				fileandenv.put("portN0", propmain.getProperty("portN0"));
				fileandenv.put("username", propmain.getProperty("username"));
				fileandenv.put("passowrd", propmain.getProperty("passowrd"));

			} else if (environment.equalsIgnoreCase("qa")) {
				FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
				propmain.load(fisqa);
				fileandenv.put("ServerUrl", propmain.getProperty("ServerUrl"));
				fileandenv.put("portN0", propmain.getProperty("portN0"));
				fileandenv.put("username", propmain.getProperty("username"));
				fileandenv.put("passowrd", propmain.getProperty("passowrd"));
			} else if (environment.equalsIgnoreCase("staging")) {
				FileInputStream fisstaging = new FileInputStream(
						System.getProperty("user.dir") + "/inputs/staging.properties");
				propmain.load(fisstaging);
				fileandenv.put("ServerUrl", propmain.getProperty("ServerUrl"));
				fileandenv.put("portN0", propmain.getProperty("portN0"));
				fileandenv.put("username", propmain.getProperty("username"));
				fileandenv.put("passowrd", propmain.getProperty("passowrd"));
			}

		} catch (Exception e) {
			System.out.println("Its exception here so we are not getting daat from properties file");
		}

		return fileandenv;
	}

	public static Map<String, String> getConfigReader() {

		if (fileandenv == null) {
			fileandenv = envAndFile();
		}

		return fileandenv;

	}

}