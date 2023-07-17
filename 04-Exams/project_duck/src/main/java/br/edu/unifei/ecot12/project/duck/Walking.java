package br.edu.unifei.ecot12.project.duck;

public class Walking implements Command {
	private Adapter d = new Adapter();

	public void execute() {
		d.duckingWalk();
	}

}
