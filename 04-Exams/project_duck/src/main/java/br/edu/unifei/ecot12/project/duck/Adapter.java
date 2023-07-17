package br.edu.unifei.ecot12.project.duck;

public class Adapter implements DuckInterface {
	    private Fish fish = new Fish();
	    private Bird bird = new Bird();
	    private Biped biped = new Biped();

	    public Adapter() {
	    }
	    

		public void duckingSwim() {
	        fish.swim();
	        System.out.println("Ducks swim with their feet.");
	    }

	    public void duckingFly() {
	        bird.fly();
	        System.out.println("Ducks can fly even if they are heavy, but for short distances.");
	    }

	    public void duckingWalk() {
	        biped.walk();
	        System.out.println("Ducks swim with their feet");
	    }
}
