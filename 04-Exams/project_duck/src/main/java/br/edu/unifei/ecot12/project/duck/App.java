package br.edu.unifei.ecot12.project.duck;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Duck d = new Duck();
		
		//Adjusting duck habitat
		TypeIsland islandType = TypeIsland.GALAPAGOS_ISLAND;
		Island island = new Island();
		island.setType(islandType);
		NorthHemisphere hemis = new NorthHemisphere();
		hemis.setRiver("Hudson_River");
		Region region = new Region();
		
		region.setContinent("North_America");
		island.setClimate("Summer");
		region.getHabitats().add(island);
		region.getHabitats().add(hemis);
		d.setRegion(region);
		
		System.out.println("Continent: " + region.getContinent());
        System.out.println("Island locate: " + island.getType());
        System.out.println("Climate: " + island.getClimate());
        System.out.println("River: " + hemis.getRiver()+ "\n");
		
		//Duck DUCKING!!!
        LifeOfDuck life = new LifeOfDuck();
        life.getCommands().add(new Swimming());
        life.getCommands().add(new Flying());
        life.getCommands().add(new Walking());
        life.living();

        //Story ugly duckling!!!
        Egg e = new Egg();
        e.setFertilized(true);
        e.setUgly(true);
        e.defineFuture(e.isUgly());
        Swan ld2 = e.getLd2();
        ld2.setColor("Black");
        System.out.println("Is duck or Swan: " + ld2.getType());
        System.out.println("Color: " + ld2.getColor());
        
        
	}

}
