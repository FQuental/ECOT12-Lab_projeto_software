package br.edu.unifei.ecot12.project.duck;

public class LittleDuck {
	private boolean ugly;
	private Duck ld;
	private Swan ld2;
	
	public void defineFuture (boolean u) {
		if (u == false) {
			setLd(new Duck());
		}else {
			setLd2(new Swan());
		}
	}

	public boolean isUgly() {
		return ugly;
	}

	public LittleDuck setUgly(boolean ugly) {
		this.ugly = ugly;
		return null;
	}

	public Duck getLd() {
		return ld;
	}

	public void setLd(Duck ld) {
		this.ld = ld;
	}

	public Swan getLd2() {
		return ld2;
	}

	public void setLd2(Swan ld2) {
		this.ld2 = ld2;
	}
}
