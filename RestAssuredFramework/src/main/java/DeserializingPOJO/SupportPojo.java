package DeserializingPOJO;

public class SupportPojo {

	private String support;
	private String url;
	
	private String text;

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "AdPojo [support=" + support + ", url=" + url + ", text=" + text + "]";
	}
	
	
	
	
	}
