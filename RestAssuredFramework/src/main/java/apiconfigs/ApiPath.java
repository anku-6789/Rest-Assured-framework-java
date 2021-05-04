package apiconfigs;

public class ApiPath {
	//here we have used nested loop

	public static final class APIPath {

		// GET REQUEST

		public static final String GET_LIST_OF_USERS = "/users";

		public static final String GET_SINGLE_USERS = "/users/2";

		// POST REQUEST
		public static final String CREATE_USER = "/users";

		// DELETE REQUEST
		public static final String DELTE_USER = "/users";

		
		
		// to check weather API is working or not
		public static void main(String[] args) {
			
			System.out.println(ApiPath.APIPath.CREATE_USER);
			
		}
		
		
	}

}
