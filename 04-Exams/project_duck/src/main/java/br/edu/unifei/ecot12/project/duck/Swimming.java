package br.edu.unifei.ecot12.project.duck;

public class Swimming implements Command {
	private Adapter d = new Adapter();

	public void execute() {
		d.duckingSwim();
	}

}
