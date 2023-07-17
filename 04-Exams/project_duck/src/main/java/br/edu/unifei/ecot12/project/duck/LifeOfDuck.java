package br.edu.unifei.ecot12.project.duck;

import java.util.ArrayList;
import java.util.List;

public class LifeOfDuck {
	List<Command> commands = new ArrayList<Command>();
	public void living() {
		for(Command c : commands) {
			c.execute();
		}
	}
	public List<Command> getCommands() {
		return commands;
	}
	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}
	
	
}
