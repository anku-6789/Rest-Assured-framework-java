package apiconfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

	public Map<String, String> defaultheaders() {
		Map<String, String> defaultHeaders = new HashMap<String, String>();

		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Access_Token", "fsfsdfsdfsdfsdfsdf");

		return defaultHeaders;

	}
//to check weather headers are working or not
	public static void main(String[] args) {

		HeaderConfigs hed = new HeaderConfigs();

		System.out.println(hed.defaultheaders());
	}

}
