package day2hw1;

public class Instructor {

	private String name;
	private String bio;
	
	public Instructor() {
		this.name=null;
		this.bio="Yazýlýmcý";
	}
	
	
	public Instructor(String name,String bio) {
		this.name=name;
		this.bio=bio;
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}
	
	

}
