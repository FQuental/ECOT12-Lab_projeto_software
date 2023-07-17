package br.edu.unifei.ecot12.project.duck;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
	private List<Goose> geese = new ArrayList<Goose>();
	private Hunter hh = new Hunter();
	private Link l = new Link();
	
	public void linked (Goose geese) {
		l.relationship = "Enemy";
	}
	public void linked (Hunter hh) {
		l.relationship = "Enemy";
	}
}