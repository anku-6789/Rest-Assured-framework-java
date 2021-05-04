package pojo;


//generally pojo referes for the case  test run sequentially after post need to validate data

//pojo stands for pain old java object and need to call API so we need to serialize that
//earlier we are passing body using map object now we are doing that using pojo class
public class PostAPIPojo {

	//here it is case Sensitive we can use initial letter capital as well
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private int subjectd;
	//fields should have getters and setters and constructor  as  well so we are making the variables private

	public PostAPIPojo(int id, String firstname, String lastname, int subjectd) {

		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.subjectd = subjectd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSubjectd() {
		return subjectd;
	}

	public void setSubjectd(int subjectd) {
		this.subjectd = subjectd;
	}

	@Override
	public String toString() {
		return "PostAPIPOjo [id=" + this.id + ", firstname=" + this.firstname + ", lastname=" + this.lastname + ", subjectd="
				+ this.subjectd + "]";
	}
	
	
	
	
	
	
}
