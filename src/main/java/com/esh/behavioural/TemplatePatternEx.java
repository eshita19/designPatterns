package com.esh.behavioural;

abstract class BuildHouse{
	
	final void build(){
		buildWalls();
		buildRoads();
	}

	abstract void buildWalls();
	abstract void buildRoads();
}

class Prestige extends BuildHouse{

	@Override
	void buildWalls() {
		System.out.println("Prestige walls");
	}

	@Override
	void buildRoads() {
		System.out.println("Prestige roads");
	}
	
}

class Brigade extends BuildHouse{
	@Override
	void buildWalls() {
		System.out.println("Brigade walls");
	}

	@Override
	void buildRoads() {
		System.out.println("Brigade roads");
	}
}
public class TemplatePatternEx {

	public static void main(String[] args) {
		new Prestige().build();
		new Brigade().build();
	}
}
