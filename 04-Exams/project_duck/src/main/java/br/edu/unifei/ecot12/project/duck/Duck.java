package br.edu.unifei.ecot12.project.duck;

public class Duck {
	private String color;
	private String gender;
	
	private Region region;
	public Link relationship;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRegion(Region region) {
		this.region= region;
	}
	public Link getRelationship() {
		return relationship;
	}
	public void setRelationship1(Link relationship) {
		this.relationship = relationship;
	}
	public void setRelationship(Link linked) {
		relationship = linked;		
	}
}
