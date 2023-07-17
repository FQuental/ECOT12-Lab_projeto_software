package br.edu.unifei.ecot12.project.duck;

import java.util.ArrayList;
import java.util.List;

public class Friend {
	private List<Carp> carps = new ArrayList<Carp>();
	private ElderOfSquare olds = new ElderOfSquare();
	private Link l = new Link();
	
	public void linked (Carp carp) {
		l.relationship = "Friend";
	}
	public void linked (ElderOfSquare olds) {
		l.relationship = "Friend";
	}
}
