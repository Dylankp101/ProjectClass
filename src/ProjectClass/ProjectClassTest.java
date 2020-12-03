package ProjectClass;

public class ProjectClassTest {
	public static void main(String[] args) {
		ProjectClass iD = new ProjectClass();
		String NonameNoDesc = iD.Project();
		String nameNoDesc = iD.Project("hbubub");
		String nameAndDesc = iD.Project("hbubub" , "hgvuvuvvuvu");
		System.out.println(NonameNoDesc);
		System.out.println(nameNoDesc);
		System.out.println(nameAndDesc);



	}

}
