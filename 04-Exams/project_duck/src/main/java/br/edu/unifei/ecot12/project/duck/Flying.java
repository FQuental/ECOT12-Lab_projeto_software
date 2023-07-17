package br.edu.unifei.ecot12.project.duck;

public class Flying implements Command {
	private Adapter d = new Adapter();

	public void execute() {
		d.duckingFly();
	}

}
