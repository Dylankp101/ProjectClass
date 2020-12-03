package ProjectClass;

public class ProjectClass {
	private String name; 
	private String description;
	
	public String Project() {
		this.name = "No Name";
		this.description = "No Description";
		return getNameAndDesc(name + "||" + description);
	}

	public String Project(String name) {
		this.name = name;
		this.description = "No Description";
		return getNameAndDesc(name + "||" + description);
		
	}

	public String Project(String name, String description) {
		return getNameAndDesc(name + "||" + description);
		
	}
	private String getNameAndDesc(String bigNameBigDesc) {
		return bigNameBigDesc;
}
}
